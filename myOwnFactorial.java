
import java.util.Scanner;
public class myOwnFactorial {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("What number do you want the factorial of?");
        int num = in.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i ++) {
            factorial = factorial * i;

        }
        System.out.println("The factorial of " + num + " is " + factorial);
    }

}

