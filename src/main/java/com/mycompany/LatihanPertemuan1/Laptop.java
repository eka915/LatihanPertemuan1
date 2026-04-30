/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class Laptop {
    // 1. Atribut
    String merk;
    int harga;
    String warna;

    // 2. Constructor
    public Laptop(String merk, int harga, String warna) {
        this.merk = merk;
        this.harga = harga;
        this.warna = warna;
    }

    // 3. Method tampil spek
    public void tampilSpek() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Harga : " + harga);
        System.out.println();
    }

    // Method diskon
    public int diskon(int persen) {
        return harga - (harga * persen / 100);
    }
}
