/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class DemoArray {
    public static void main(String[] args) {
        // 1. Deklarasi dan Inisialisasi Langsung
        String[] namaBuah = {"Apel", "Jeruk", "Mangga"};
        // 2. Mengakses data
        System.out.println("Buah Pertama : " + namaBuah[0]); // Apel
        System.out.println("Buah Kedua "+ namaBuah[1]); // Jeruk
        System.out.println("Buah Ketiga :" + namaBuah[2]); // Mangga
        
        // 3. Mengubah data array
        namaBuah[1] = "Nanas"; // Mengganti Jeruk jadi Nanas
        System.out.println("Buah Kedua (Setelah diubah): " + namaBuah[1]);
        
        // 4. Mengetahui panjang array
        System.out.println("Jumlah Buah : " + namaBuah.length);
    }
}
