import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class RepStr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();

        HashMap<String,Integer> hm = new HashMap<>();

        for(int i =0;i<s.length();i++)
        {
            if (hm.containsKey(s.substring(i,i+1)))
            {
                int q=hm.get(s.substring(i,i+1));
                hm.replace(s.substring(i,i+1),q+1);
            }
            else
            {
                String x = s.substring(i,i+1);
                hm.put(x,1);
            }
        }

        for (String r: hm.keySet())
        {
            int e=hm.get(r);
            if (e>1)
            {
                System.out.print(r);
                System.out.print(" ");
            }
        }


    }
}
