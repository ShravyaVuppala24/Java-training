import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RevStr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans ="";

        for(int i = s.length()-1;i>=0;i--)
        {
            ans+=s.substring(i,i+1);
        }

        System.out.println(ans);


    }
}

