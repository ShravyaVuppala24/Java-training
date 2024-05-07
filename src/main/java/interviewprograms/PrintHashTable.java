package interviewprograms;

import java.util.Hashtable;

public class PrintHashTable {
    public static void main (String args[])
    {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("A",1);
        ht.put("B",2);
        ht.put("C",3);
        ht.put("D",4);
        ht.put("E",5);

        for (String i:ht.keySet())
        {
            System.out.println(i+":" +ht.get(i));
        }
    }
}
