/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class Programmer extends Pegawai {

    private double bonus;

    public Programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    @Override
    public void tampilInfo() {
        System.out.println("--- Data Programmer ---");
        System.out.println("Nama  : " + nama);
        System.out.println("Gaji  : Rp " + gajiPokok);
        System.out.println("Bonus : Rp " + bonus);
        System.out.println("Total : Rp " + (gajiPokok + bonus));
    }
}