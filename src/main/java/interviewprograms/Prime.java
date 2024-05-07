package interviewprograms;
import java.util.*;

public class Prime {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean x= false;
        if (a<2)
        {
            System.out.println("Not Prime");
        }

        else {
            for (int i=2;i<a;i++)
            {
                if (a%i==0)
                {
                    System.out.println("Not a Prime");
                    x=true;
                    break;
                }
            }
        }

        if (a>=2 && x==false)
        {
            System.out.println("Prime");
        }
    }
}
