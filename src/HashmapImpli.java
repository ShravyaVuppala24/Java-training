import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class HashmapImpli {
    public static void main(String args[])
    {
        HashMap<String,Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of transcations");
        int num = sc.nextInt();
        while(num>0)
        {
            System.out.println("Enter the name");
            String s = sc.next();
            System.out.println("Enter the amount");
            int sum=sc.nextInt();
            if(hm.containsKey(s))
            {
                sum+=hm.get(s);
                hm.replace(s,sum);
            }
            else{
                hm.put(s,sum);
            }
            num-=1;
        }

        for(String j:hm.keySet())
        {
            System.out.print(j);
            System.out.print(" ");
            System.out.println(hm.get(j));
        }
    }


}
