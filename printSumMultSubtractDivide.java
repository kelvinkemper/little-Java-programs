import java.util.Scanner;

public class printSumMultSubtractDivide {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 2 numbers to compare them! ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = x + y;
        int b = x * y;
        int c = x - y;
        int d = x / y;
        int e = x % y;
        System.out.println("Addition: " + a);
        System.out.println("Multiplication: " + b);
        System.out.println("Subtraction: " + c);
        System.out.println("Division: " + d);
        System.out.println("Remainder/Modulo: " + e);
    }

}
