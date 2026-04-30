/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class DemoMethodVoid {
    // 1. Method untuk mencetak garis pembatas
    static void garis() {
        System.out.println("--------------------");
    }

    // 2. Method dengan parameter (menerima input)
    static void sapaTeman(String nama) {
        System.out.println("Halo, " + nama + "! Selamat datang di Java.");
    }

    public static void main(String[] args) {

        // Memanggil method
        garis(); 
        sapaTeman("Budi"); 
        sapaTeman("Siti");
        garis();
    }
}
