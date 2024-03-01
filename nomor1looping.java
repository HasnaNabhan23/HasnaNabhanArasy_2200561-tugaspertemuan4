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
public class nomor1looping {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        //Deklarasi variabel
        int n;
        
        System.out.println("PROGRAM PERULANGAN SAMPAI BATAS N");

        // Input data
        System.out.print("masukan nilai n : ");
        n = keyboard.nextInt();

        //proses
        if(n>=1){
            for(int i=1;i<=n;i++){
                System.out.println(i);
            }
        }else{
            System.out.println("ERROR ! angka n harus lebih dari 0");
        }
    }
    
}
