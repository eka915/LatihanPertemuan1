/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class DemoException {
    public static void main (String[]args){
        int angka1 = 10;
        int angka2 = 0; // Pembagi nol
        
        System.out.println("Program dimulai...");
        
        try {
            //Kode yang berisiko error
            int hasil = angka1 / angka2;
            System.out.println("Hasil pembagian:" + hasil);
        } catch (ArithmeticException e) {
            // Kode jika terjadi error aritmatika
            System.out.println("Error: Tidak bisa membagi dengan angka nol!");
            //System.out.println(Detail error: " + e.getMessange());
        }
        
        System.out.println("Program selesai."); // Ini akan tetap tereksekusi
    }
}
