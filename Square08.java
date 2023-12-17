import java.util.Scanner;
/**
 * Square08
 */
public class Square08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc08.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++){
            for (int i = 1; i <=N; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}