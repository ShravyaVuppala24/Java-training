package interviewprograms;

import java.util.*;

public class Palindrome {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();

        int p1=0;
        int p2=str.length()-1;
        boolean x=true;

        while(p1<=p2)
        {
            if (str.charAt(p1)!=(str.charAt(p2)))
            {
                System.out.println("Not a Palindrome");
                x=false;
                break;
            }
            else {
                p1+=1;
                p2-=1;
            }
        }
        if(x==true)
        {
            System.out.println("Palindrome");
        }
    }
}
