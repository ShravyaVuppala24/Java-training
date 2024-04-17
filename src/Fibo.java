import java.util.ArrayList;
import java.util.Scanner;

public class Fibo
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> myList = new ArrayList<>();

        int b = 0;
        int c = 1;
            for (int i = 1; i <= a; i++)
            {
                int x = b + c;
                myList.add(c);
                b=c;
                c=x;

            }

        for(int r:myList)
        {
            System.out.print(r);
            System.out.print(" ");
        }

    }
}