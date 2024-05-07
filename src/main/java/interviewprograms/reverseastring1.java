package interviewprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class reverseastring1 {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        StringBuilder sb = new StringBuilder(s1);
        System.out.println(sb.reverse());


//        for (int i = s1.length() - 1; i >= 0; i--)
//        {
//            System.out.print(s1.charAt(i));
//        }
    }
}
