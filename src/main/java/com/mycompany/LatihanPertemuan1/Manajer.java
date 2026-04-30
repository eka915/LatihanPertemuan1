/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class Manajer extends Pegawai {

    private double tunjangan;

    // Constructor
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Method overriding
    @Override
    public void tampilInfo() {
        System.out.println("--- Data Manajer ---");
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + tunjangan);
        System.out.println("Total : Rp " + (gajiPokok + tunjangan));
    }
}
