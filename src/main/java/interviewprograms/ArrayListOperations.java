package interviewprograms;
import java.util.*;

public class ArrayListOperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println("Enter the elements");
        System.out.println(sc.nextInt());
        while (sc.hasNextInt()) {
            System.out.println(sc.hasNextInt());
            ar.add(sc.nextInt());
        }

        System.out.println(ar);
    }
}
//        System.out.println("Enter the size of the array");
//
//        int n = sc.nextInt();
//
//        System.out.println("Enter the array values");
//        for (int i=0;i<n;i++)
//        {
//            ar.add(sc.nextInt());
//        }
//
//        System.out.println("Enter the option, Add, Fetch, Remove");
//
//        String op = sc.next();
//
//        if (op.equals("Add"))
//        {
//            System.out.println("Enter the value to add into the array");
//            ar.add(sc.nextInt());
//            System.out.println("The modified Array is: ");
//            System.out.print(ar);
//        }
//
//        if (op.equals("Fetch"))
//        {
//            System.out.println("Enter the index value");
//            System.out.println("The element at the given index is w" +ar.get(sc.nextInt()));
//        }
//        if (op.equals("Remove")) {
//            System.out.println("Enter index value to remove");
//            ar.remove(sc.nextInt());
//            System.out.println("The modified Array is: ");
//            System.out.print(ar);
//        }
//
//
//    }
//}
