/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class MahasiswaEnkapsulasi {
    // 1. Atribut PRIVATE
    private String nama;
    private int umur;

    // 2. Constructor
    public MahasiswaEnkapsulasi(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // 3. Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // 4. Setter
    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public void setUmur(int umurBaru) {
        // Validasi
        if (umurBaru > 0) {
            this.umur = umurBaru;
        } else {
            System.out.println("Error: Umur tidak boleh nol atau negatif!");
        }
    }

    // Method tampil
    public void tampilInfo() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
}
