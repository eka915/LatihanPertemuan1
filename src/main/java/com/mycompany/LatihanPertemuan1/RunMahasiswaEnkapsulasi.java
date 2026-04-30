/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class RunMahasiswaEnkapsulasi {
    public static void main(String[] args) {

        MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi("Andi", 20);

        // Mengakses data menggunakan Getter
        System.out.println("Nama Awal: " + mhs.getNama());

        // Mengubah data menggunakan Setter
        System.out.println("\nMengubah nama menjadi Budi...");
        mhs.setNama("Budi");

        // Mencoba mengisi umur negatif (akan ditolak)
        System.out.println("Mencoba set umur = -5...");
        mhs.setUmur(-5);

        // Mengisi umur yang benar
        System.out.println("Mencoba set umur = 21...");
        mhs.setUmur(21);

        // Tampilkan hasil akhir
        mhs.tampilInfo();

        // mhs.umur = 10; // ERROR! karena private
    }
}
