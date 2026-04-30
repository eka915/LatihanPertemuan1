/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class DemoArray2D {
   public static void main(String[] args) {
        
        // 1. Deklarasi langsung
        int[][] angka = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // 2. Mengakses data spesifik
        // Baris 0, Kolom 1 -> Nilainya 20
        System.out.println("Data di Baris 0, Kolom 1: " + angka[0][1]);

        // Baris 2, Kolom 0 -> Nilainya 70
        System.out.println("Data di Baris 2, Kolom 0: " + angka[2][0]);

        // 3. Mengetahui ukuran array
        System.out.println("Jumlah Baris: " + angka.length);
        System.out.println("Jumlah Kolom: " + angka[0].length);
    }
}
