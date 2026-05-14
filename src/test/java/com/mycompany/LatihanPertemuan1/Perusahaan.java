/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

import com.mycompany.LatihanPertemuan1.Perusahaan.*;

/**
 *
 * @author Hype GLK
 */
class DataPerusahaan {
    String namaPerusahaan;

    DataPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    void infoPerusahaan() {
        System.out.println("Perusahaan : " + namaPerusahaan);
    }
}

class Pegawai {
    String nama;
    int gaji;

    Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
    }
}

class Manajer extends Pegawai {

    Manajer(String nama, int gaji) {
        super(nama, gaji);
    }

    @Override
    void tampilInfo() {
        System.out.println("=== Data Manajer ===");
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
    }
}

class Programmer extends Pegawai {

    Programmer(String nama, int gaji) {
        super(nama, gaji);
    }

    @Override
    void tampilInfo() {
        System.out.println("=== Data Programmer ===");
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
    }
}

public class Perusahaan {

    public static void main(String[] args) {

        DataPerusahaan p1 = new DataPerusahaan("PT Maju Jaya");

        p1.infoPerusahaan();

        System.out.println();

        Pegawai[] daftarPegawai = {
            new Manajer("Budi", 10000000),
            new Programmer("Andi", 8000000),
            new Programmer("Rina", 9000000)
        };

        for (Pegawai p : daftarPegawai) {

            p.tampilInfo();

            if (p instanceof Manajer) {
                System.out.println("Tugas: Meeting");
            } 
            else if (p instanceof Programmer) {
                System.out.println("Tugas: Coding");
            }

            System.out.println();
        }
    }
}