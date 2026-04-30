/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class Mahasiswa {
    // 1. Atribut
    public String nama;
    public String nim;
    public double ipk;

    // 2. Constructor
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // 3. Method tampil info
    public void tampilInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("IPK  : " + ipk);
        System.out.println();
    }

    // Method belajar
    public void belajar() {
        System.out.println(nama + " sedang belajar Java OOP.");
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {

        // Membuat object
        Mahasiswa mhs1 = new Mahasiswa("Budi", "12345", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Siti", "67890", 3.8);

        // Menampilkan info
        mhs1.tampilInfo();
        mhs1.belajar();

        mhs2.tampilInfo();
        mhs2.belajar();
    }

}
