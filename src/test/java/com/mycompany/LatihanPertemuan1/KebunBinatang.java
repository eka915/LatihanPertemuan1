/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class KebunBinatang {
    public static void main(String[]args) {
        // Membuat array of Hewan
        Hewan[] kumpulanHewan = new Hewan[3];
        
        // Mengisi Array dengan objek yang berbeda-beda
        kumpulanHewan[0] = new Hewan();
        kumpulanHewan[1] = new Kucing();
        kumpulanHewan[2] = new Anjing();
        
        System.err.println("===Simfoni Kebun Binatang ===");
        //Loop satu per satu
        for (Hewan h : kumpulanHewan) {
            h.bersuara();
        }
    }
}
