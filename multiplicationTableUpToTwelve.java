import java.util.Scanner;
public class multiplicationTableUpToTwelve {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that you want the multiplication table of up to 12: ");
        int x = sc.nextInt();

        for (int i = 1; i <= 12; i +=1) {
            int multiple = x * i;
            System.out.println("The multiple of " + x + " in the " + i + " place is " + multiple);
        }
    }
}
