/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class RunPegawai {
    public static void main(String[] args) {

        // 1. Buat Object Pegawai biasa
        Pegawai pgw = new Pegawai("Anton", 3000000);
        System.out.println("== Pegawai Biasa ==");
        pgw.tampilInfo();
        System.out.println();

        // 2. Buat Object Manajer (turunan Pegawai)
        Manajer mnr = new Manajer("Budi", 5000000, 2000000);
        System.out.println("== Pegawai Manajer ==");
        mnr.tampilInfo(); // method override dipanggil
    }
}
