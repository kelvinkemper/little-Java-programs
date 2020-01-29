import java.util.Scanner;
public class scannerUtility {


    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("What 2 numbers do you want to multiply? ");
        int x;
        int y;
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("The answer is: " + (x*y));

    }

}
