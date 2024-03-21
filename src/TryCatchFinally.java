import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            if (b > 0) {
                int result = a / b;
                System.out.println("Answer is " + result);
            }

            else {
                System.out.println("Enter a divisor greater than 0");
            }


        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        finally {
            System.out.println("End of Program");
        }
    }
}

