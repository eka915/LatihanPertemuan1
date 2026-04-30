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
public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] nilai;
        int jumlahData;
        double total = 0;
        double rataRata;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahData = scan.nextInt();

        // Inisialisasi array
        nilai = new int[jumlahData];

        // Input nilai
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = scan.nextInt();
            total += nilai[i];
        }

        // Hitung rata-rata
        rataRata = total / jumlahData;

        System.out.println("\n===== HASIL =====");
        System.out.println("Total Nilai : " + total);
        System.out.println("Rata-rata : " + rataRata);

        // Cek nilai tertinggi dan terendah
        int max = nilai[0];
        int min = nilai[0];

        for (int i = 1; i < jumlahData; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("Nilai Tertinggi: " + max);
        System.out.println("Nilai Terendah: " + min);

        scan.close();
    }
}

