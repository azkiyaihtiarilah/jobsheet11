import java.util.Scanner;
import java.util.Random;
/**
 * Quiz08
 */
public class Quiz08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        Random rand08 = new Random();

        char menu = 'y'; // varibel menu untuk memulai permainan
        do {
            int number = rand08.nextInt(10) + 1; // untuk menghasilkan angka random dari 1 - 10
            boolean success = false; //variabel berisikan perintah salah
            do{
                System.out.print("Guess the number (1-10): "); // memerintahkan user untuk input angka
                int answer = input08.nextInt(); // menyimpan inputan user
                input08.nextLine(); // mengabaikan karakter new line

                if (answer < number) {
                    System.out.println("Your guess is too small");
                } else if (answer > number){
                    System.out.println("Your guess is too big");
                } else{
                    System.out.println("Congratulations, you guessed right!");
                }
                success = (answer == number); // memeriksa apakah inputan user sesuai dengan random number 
            } while (!success); // mengulangi perintah untuk user memasukkan angka kembali, jika angka tidak sesuai random number
            System.out.print("Do you want to repeat the game (Y/N): "); // question mengulangi permainan atau berhenti
            menu = input08.next().charAt(0); // membaca input user, lanjut atau tidak permainan
            input08.nextLine(); // mengabaikan karakter new line
        } while (menu == 'Y' || menu == 'y'); //mengulang kembali permaianan jika inputan "Y/y"
    }
}