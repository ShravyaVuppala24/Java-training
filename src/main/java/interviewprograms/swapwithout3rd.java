package interviewprograms;

import java.util.*;

public class swapwithout3rd {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer a");
        int a = sc.nextInt();
        System.out.println("Enter integer b");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Now a is "+a);
        System.out.println("Now b is "+b);
    }
}
