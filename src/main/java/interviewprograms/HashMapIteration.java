package interviewprograms;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapIteration {

    public static  void main(String args[])
    {
        Map<String,Integer> hm = new HashMap<>();

        hm.put("One",1);
        hm.put("Two",2);
        hm.put("Three",3);

        for(String item :hm.keySet())
        {
            System.out.println(item +":" +hm.get(item));
        }

//        Iterator it = hm.entrySet().iterator();
//
//        while(it.hasNext())
//        {
//            Map.Entry h1 = (Map.Entry) it.next();
//
//            System.out.println(h1.getKey() +":" +h1.getValue());
//        }
//
//        for(Map.Entry h2: hm.entrySet())
//        {
//            System.out.println(h2.getKey() +":" +h2.getValue());
//
//        }
    }
}
