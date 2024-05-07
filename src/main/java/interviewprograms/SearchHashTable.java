package interviewprograms;

import java.util.*;
public class SearchHashTable
{
    public static void main(String args[])
    {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("A",1);
        ht.put("B",2);
        ht.put("C",3);
        ht.put("D",4);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String element to search");
        String ele = sc.next();

        if (ht.containsKey(ele))
        {
            System.out.println("Value of the given element: "+ht.get(ele));
        }
        else {
            System.out.println("Not Present");
        }


    }
}
