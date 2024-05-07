package interviewprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class StackOperations {
    public static void push(ArrayList<Integer> ar, int x)
    {
        ar.add(x);
    }
    public static void pop(ArrayList<Integer> ar) {
        if (ar.size()!=0) {
            ar.remove(ar.size() - 1);
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int op = sc.nextInt();

        for (int i = 0; i < op; i++) {
            System.out.println("Enter operation (push/pop):");
            String oper = sc.next();

            if (oper.equals("push")) {
                System.out.println("Enter value to push into stack:");
                int a = sc.nextInt();
                push(ar, a);
            }
            else
            {
                pop(ar);
            }
        }
        System.out.println(ar);
    }
}
