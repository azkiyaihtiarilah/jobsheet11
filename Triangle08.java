import java.util.Scanner;
/**
 * Triangle08
 */
public class Triangle08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N = sc08.nextInt();
        int i = 0;
        while (i <= N ) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}