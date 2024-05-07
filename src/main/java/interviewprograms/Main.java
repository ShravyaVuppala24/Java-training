package interviewprograms;

import java.util.concurrent.ExecutionException;

public class Main {
        public static void main(String[] args) {
            NPE np = new NPE(); // Creating a Person object reference that points to null
            try {
                String name = np.getName(null); // This will throw a NullPointerException
                System.out.println("Name is " + name);
            }
            catch(NullPointerException e)
            {
                System.out.println(e.getMessage());
            }

            np.arrayBounds();
            np.fileNot();
        }
    }
