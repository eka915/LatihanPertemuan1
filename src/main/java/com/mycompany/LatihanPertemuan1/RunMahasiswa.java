/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class RunMahasiswa {
     public static void main(String[] args) {

        // 1. Membuat Object (Instansiasi)
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "2024001", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Siti Aminah", "2024002", 3.8);

        // 2. Mengakses Method Object
        mhs1.tampilInfo();
        mhs2.tampilInfo();

        // 3. Mengakses Atribut Object
        System.out.println("IPK " + mhs1.nama + " adalah " + mhs1.ipk);

        // 4. Memanggil method lain
        mhs1.belajar();
        mhs2.belajar();
    }
}
