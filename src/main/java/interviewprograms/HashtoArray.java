package interviewprograms;
import java.util.*;
public class HashtoArray {

    public static void main(String args[])
    {
                HashSet<String> hs = new HashSet<>();

                hs.add("Apple");
                hs.add("Banana");
                hs.add("Orange");
                hs.add("Grapes");

                String[] array = new String[hs.size()];
                hs.toArray(array);

                System.out.println("Elements in the array:");
                for (String element : array) {
                    System.out.println(element);
                }
            }
        }

