package interviewprograms;

import java.util.HashMap;
import java.util.Scanner;

public class stringcounthashmap {
    public static void main (String args[])
    {
        HashMap<String,Integer> hm = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String s1= sc.nextLine();

        String[] words = s1.split("\\s+");

        for (String i:words)
        {


            if (hm.containsKey(i)) {
                int x = hm.get(i);
                hm.put(i, x + 1);
            } else {
                hm.put(i, 1);
            }
        }

        for (String x:words)
        {
            System.out.println(x +":"+hm.get(x));
        }
    }
}
