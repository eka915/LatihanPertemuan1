/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class Pegawai {
    // Atribut (protected → bisa diakses class turunan)
    protected String nama;
    protected double gajiPokok;

    // Constructor
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method
    public void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
}
