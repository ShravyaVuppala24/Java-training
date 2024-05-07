package interviewprograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class NPE {

    public String getName(String name) throws NullPointerException {
        if (name == null) {
            throw new NullPointerException("this is a custom message for null pointer exception");
        }
        return name;
    }

    public void arrayBounds()
    {
        int [] ar = {1,2,3,4,5};

        try
        {
            int n = ar[6];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void fileNot()
    {
        String filename = "Abc.txt";

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filename));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}



