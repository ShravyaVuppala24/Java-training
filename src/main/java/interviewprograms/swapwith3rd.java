package interviewprograms;

import java.util.*;

public class swapwith3rd {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer a");
        int a= sc.nextInt();
        System.out.println("Enter integer b");
        int b = sc.nextInt();

        int c;

        c=a;
        a=b;
        b=c;

        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
