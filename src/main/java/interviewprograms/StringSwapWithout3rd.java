package interviewprograms;

import java.util.*;
public class StringSwapWithout3rd {

    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start digit");
        int start = sc.nextInt();
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        if((start&1)==1)
        {
            start=start+1;
        }

        while(n>0)
        {
            System.out.print(start +" ");
            start+=2;
            n-=1;
        }

    }
}
