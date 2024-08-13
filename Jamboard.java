import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import org.w3c.dom.Document;

/**
 * Basic prototype for jamboard with highlightable words and dynamic word/page counts.
 * XML files indicate layout of lessons, which are loaded by passing file path to Jamboard constructor.
 * Prototype also currently displays a toolbar with mouse cursor selection and a laser pointer. 
 */
public class Jamboard extends JFrame {
	// folder paths
	public static final String lessons_text = ".\\HUG_Assets\\Lessons_Text\\",
			lessons_images = ".\\HUG_Assets\\Lessons_Images\\",
			toolbar_images = ".\\HUG_Assets\\Toolbar_Images\\",
			cursor_images = toolbar_images + "Mouse_Cursors\\";
	
	public static final int STICKYNOTE_FONT_SIZE = 18; // affects font sizing of entire Jamboard.
	public static final Dimension NOTE_SIZE = new Dimension(200, 200); // Smaller size for sticky notes
	
	public static final int FONT_SIZE = 25; // affects font sizing of entire Jamboard.
	
	// main function launches a Jamboard with provided lesson
	public static void main(String[] args) {
		 SwingUtilities.invokeLater(() -> new Jamboard(lessons_text + "Blue Lesson 1.xml"));
	}
	
	private final ReadingPane readPane; // stores the JPanel sub-class which contains the reading for toolbar interaction
	
	// constructor builds JFrame and adds ReadingPane
	public Jamboard(String filepath) {
		// setup JFrame
		super("HUG Jamboard Prototype"); // window title
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// load and parse passage file
		Document fileInfo = Misc.parseXML(filepath);
//		Misc.printXML(fileInfo, 0); // helps with debugging related to xml structure
		
		// Jamboard/JFrame primary content is the master JPanel
		JPanel masterPane = new JPanel(new BorderLayout()); // use BorderLayout as there are <= 5 main components
		setContentPane(masterPane);
		
		// Create reading title (NORTH)
		String title = fileInfo.getElementsByTagName("title").item(0).getFirstChild().getNodeValue(); // extract passage title
		JLabel title_label = new JLabel(title, SwingConstants.CENTER); // create title label
		title_label.setFont(new Font("Serif", Font.BOLD, FONT_SIZE + 8));
		masterPane.add(title_label, BorderLayout.NORTH); // add title label in the north of JFrame layout
		
		// Create an interactable display (readPane) using the reading (CENTER)
		readPane = new ReadingPane(fileInfo); // build the reading pane and populate with xml pages content
		masterPane.add(readPane, BorderLayout.CENTER); // add readPane in the center of JFrame layout
	
		// Create tutor toolbar (EAST)
		masterPane.add(new TutorToolbar(masterPane), BorderLayout.EAST); // add toolbar in the east of JFrame layout
		
		// Create a panel for colorful labels and text fields (WEST)
        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new BoxLayout(colorPanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical stacking
        colorPanel.add(createStickyNotePanel("Student Name:", Color.WHITE,true));
        colorPanel.add(createStickyNotePanel("Tutor Name:", Color.WHITE,true));
        Color customYellow = Color.decode("#f8f554"); // yellow, hex code
        colorPanel.add(createStickyNotePanel("1st read:", customYellow,true));
        colorPanel.add(createStickyNotePanel("Remember to Play Ping Pong Word Game before the Second Read!", Color.PINK,false));
        Color customBlue = Color.decode("#8ceeea"); // yellow, hex code
        colorPanel.add(createStickyNotePanel("2nd read:", customBlue,true));
        Color customGreen = Color.decode("#81ca76"); // green, hex code
        colorPanel.add(createStickyNotePanel("Whip Words:", customGreen,true));
        
        masterPane.add(colorPanel, BorderLayout.WEST); // Add the colorPanel to the west of the masterPane
		
		// finish instantiation
		pack(); // optimize (most) child JPanel layouts
		setMinimumSize(masterPane.getPreferredSize()); // ensure JFrame resizing will not ever cut-off any content
//		setPreferredSize(getToolkit().getScreenSize()); // If Jamboard should default to being maximized to the screen size
		setVisible(true); // display Jamboard
	}
	
	// Helper method to create a sticky note panel with a JLabel and optional JTextArea
	private JPanel createStickyNotePanel(String labelText, Color backgroundColor, boolean withTextArea) {
	    JPanel stickyNotePanel = new JPanel(new BorderLayout());
	    stickyNotePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    stickyNotePanel.setPreferredSize(NOTE_SIZE);
	    
	    JLabel label = new JLabel("<html>" + labelText.replaceAll("\n", "<br>") + "</html>", SwingConstants.CENTER);
	    label.setFont(new Font("Serif", Font.BOLD, STICKYNOTE_FONT_SIZE));
	    label.setOpaque(true);
	    label.setBackground(backgroundColor);
	    
	    stickyNotePanel.add(label, BorderLayout.NORTH);
	    
	    if (withTextArea) {
	        JTextArea textArea = new JTextArea();
	        textArea.setFont(new Font("Serif", Font.PLAIN, STICKYNOTE_FONT_SIZE));
	        textArea.setBackground(backgroundColor);
	        textArea.setLineWrap(true);
	        textArea.setWrapStyleWord(true);
	        textArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	        
	        stickyNotePanel.add(new JScrollPane(textArea), BorderLayout.CENTER);
	    }
	    
	    return stickyNotePanel;
	}
		
	
	/**
	 * Toolbar with several tool options to help with tutoring.
	 * Options include a laser pointer, mouse cursor selection, etc.
	 * Toolbar should always be positioned on the EAST side of a panel to prevent graphical issues with subtoolbars.
	 */
	public class TutorToolbar extends JToolBar {
		private static final Dimension ICON_SIZE = new Dimension(60, 60); // size of icons on toolbar
		
		// constructor builds the tutor toolbar
		public TutorToolbar(Container mainPane) {
			// setup JToolBar
			super();
			setOrientation(SwingConstants.VERTICAL); // vertical since positioned on the EAST of a parent JPanel
			setFloatable(false); // ensures toolbar is always attached to the Jamboard
			
			
			// For Mouse Cursor Selection --------------------------
			// fetch the icons used to indicate mouse cursor options
			ImageIcon[] icons = Misc.convertArray(Misc.readFolder(cursor_images), (file) -> Misc.readIcon(file, ICON_SIZE), ImageIcon.class);
			
			// create the cursor selection feature 
			Subtoolbar changeMouse = new Subtoolbar(Misc.readIcon(cursor_images + "Cursor.png", ICON_SIZE), icons, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ImageIcon icon = icons[Integer.parseInt(e.getActionCommand())]; // determines which cursor to change to
//					((Subtoolbar)e.getSource()).setIcon(icon); // if we want to have an indicator of the current selction. Though this seems redundant
					mainPane.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(icon.getImage(), mainPane.getLocation(), "img"));
				}
			});
			add(changeMouse); // add the cursor change option to the toolbar
			
			// For Laser Pointer -----------------------------------
			JToggleButton toggle_laser = new JToggleButton(Misc.readIcon(toolbar_images + "RecordButton.png", ICON_SIZE)); // Load laser icon for toolbar
			toggle_laser.setPreferredSize(ICON_SIZE);
			toggle_laser.addActionListener(e -> readPane.setEdit(!readPane.pages.toggleDraw())); // Enabling drawing on DrawPanel disables editing
			add(toggle_laser); // add the laser toggle option to the toolbar
		}
		
		/**
		 * Subtoolbar implements a secondary toolbar that pops-up to display options when its associated button (superclass) is clicked.
		 * When a subtoolbar option is selected, an associated action (passed in through constructor) is performed.
		 */
		private class Subtoolbar extends JButton {
			// adding 7 pixels to default icon size ensures popup/subtoolbar edges are flush to corresponding toolbar icon
			private static final Dimension BUTTON_SIZE = Misc.dimSum(ICON_SIZE, new Dimension(7, 7));
			
			public Subtoolbar(ImageIcon mainIcon, ImageIcon[] icons, ActionListener action) {
				super(mainIcon);
				ButtonGroup buttonGroup = new ButtonGroup(); // used to ensure only one ToggleButton in the group is pressed at a time
				JPopupMenu popup = new JPopupMenu();
				popup.setLayout(new GridLayout(1, 0)); // Subtoolbar popup consists of 1 row of buttons
				// Initialize and add the Subtoolbar options
				for (int i = 0; i < icons.length; i++) {
					JToggleButton toggleButton = new JToggleButton(icons[i]);
					toggleButton.setPreferredSize(BUTTON_SIZE);
					toggleButton.setActionCommand(Integer.toString(i)); // in order to allow action to distinguish which button is selected
					toggleButton.addActionListener(action); // all selections run the same action
					popup.add(toggleButton);
					buttonGroup.add(toggleButton);
				}
				popup.show(null, 0, 0); // initial call to show prevents incorrect positioning
				popup.setVisible(false);
				addActionListener(e -> popup.show(this, -popup.getWidth(), getY())); // how Subtoolbar opens
			}
		}
	}
}
