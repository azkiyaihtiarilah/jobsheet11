import java.util.Scanner;

/**
 * NestedLoop08
 */
public class NestedLoop08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++){ // loop pertama untuk mengisi data kota
            System.out.println("City: "+ i);
            for(int j = 0; j < temps[0].length; j++){ // loop kedua untuk mengisi data suhu perhari
                System.out.print("Day "+ (j + 1) + ": "); 
                temps[i][j] = input08.nextDouble(); // membaca inputan suhu dari pengguna dan menyimpan dalam array
            }
            System.out.println(); // memberikan baris kosong antar setiap kota(/n)
        }

        int queue = 0;
        for (double [] citytemps : temps){
            System.out.println("City: "+ (queue + 1) + ": ");
            double total = 0.0;
            for(double temperature : citytemps){
                System.out.print(temperature + " ");
                total += temperature;
            }
            double average = total / citytemps.length;
            System.out.println("\n Average: "+ average);
            queue++;
        }
    }
}