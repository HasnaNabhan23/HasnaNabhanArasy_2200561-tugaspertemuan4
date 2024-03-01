package tugaspertemuan4;

import java.util.Scanner;

public class nomor3looping {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // deklarasi variabel
        int n, hasil;

        System.out.println("SOAL NOMOR 3 : MENGHITUNG N!");

        // input data
        hasil = 1;
        System.out.print("Input nilai n : ");
        n = keyboard.nextInt();

        // Proses
        StringBuilder output = new StringBuilder(); // Membuat objek StringBuilder untuk menampung output
        for (int i = n; i >= 1; i--) { // Mengubah iterasi menjadi dari n ke 1
            hasil = hasil * i;
            output.append(i); // Menambahkan angka ke StringBuilder
            if (i != 1) { // Menambahkan tanda * kecuali untuk angka terakhir
                output.append("*");
            }
        }

        // Output
        System.out.println(n + "!=" + output.toString() + "=" + hasil);
    }
}