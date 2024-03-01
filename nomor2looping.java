/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nomor2looping {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // deklarasi variabel
        int batasAwal, batasAkhir, jumlahBilGanjil;

        System.out.println("SOAL NOMOR 2 : JUMLAH BILANGAN GANJIL");

        // input data
        jumlahBilGanjil = 0;
        System.out.print("masukan batas awal : ");
        batasAwal = keyboard.nextInt();
        System.out.print("masukan batas akhir : ");
        batasAkhir = keyboard.nextInt();

        //proses
        for(int i = batasAwal;i<=batasAkhir;i++){
            if(i % 2 == 1 ){
                jumlahBilGanjil = jumlahBilGanjil +1;
            }else{

            }
        }
        System.out.println("jumlah bilangan ganjil yaitu "+jumlahBilGanjil);
    }
}
