/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

import java.util.Scanner;

/**
 *
 * @author Hype GLK
 */
public class KalkulatorMethod {
    // Method untuk penjumlahan
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method untuk pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method untuk perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method untuk pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method tampil menu
    static void tampilMenu() {
        System.out.println("=== KALKULATOR METHOD ===");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali (*)");
        System.out.println("4. Bagi (/)");
        System.out.println("5. Keluar");
        System.out.print("Pilih: ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;
        double angka1, angka2, hasil;

        do {
            tampilMenu();
            pilihan = scan.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan Angka 1: ");
                angka1 = scan.nextDouble();

                System.out.print("Masukkan Angka 2: ");
                angka2 = scan.nextDouble();

                // Pemanggilan method
                if (pilihan == 1) hasil = tambah(angka1, angka2);
                else if (pilihan == 2) hasil = kurang(angka1, angka2);
                else if (pilihan == 3) hasil = kali(angka1, angka2);
                else hasil = bagi(angka1, angka2);

                System.out.println("Hasil: " + hasil);

            } else if (pilihan == 5) {
                System.out.println("Terima kasih...");
            } else {
                System.out.println("Pilihan salah!");
            }

        } while (pilihan != 5);

        scan.close();
    }
}
