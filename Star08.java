import java.util.Scanner;
/**
 * Star
 */
public class Star08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc08.nextInt();

        for (int i = 1 ; i > n; i--) {
            System.out.print("*");
        }
    }
}