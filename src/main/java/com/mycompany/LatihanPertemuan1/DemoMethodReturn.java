/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class DemoMethodReturn {
    // Method menghitung luas persegi panjang
    static int hitungLuas(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil; // harus di dalam method
    }

    // Method mengecek bilangan genap
    static boolean isGenap(int angka) {
        if (angka % 2 == 0) {
            return true;
        } else {
            return false;
        }

        // versi singkat:
        // return (angka % 2 == 0);
    }

    public static void main(String[] args) {

        // 1. Menggunakan method hitungLuas
        int luas = hitungLuas(10, 5);
        System.out.println("Luas Persegi Panjang: " + luas);

        // Bisa langsung
        System.out.println("Luas Lain: " + hitungLuas(7, 3));

        // 2. Menggunakan method isGenap
        int nilai = 10;

        if (isGenap(nilai)) {
            System.out.println(nilai + " adalah Genap");
        } else {
            System.out.println(nilai + " adalah Ganjil");
        }
    }
}
