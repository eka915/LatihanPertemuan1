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
public class NilaiMahasiswa {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Misal: 2 Mahasiswa, masing-masing punya 3 nilai mapel
        int jumlahMahasiswa = 2;
        int jumlahMapel = 3;

        int[][] nilai = new int[jumlahMahasiswa][jumlahMapel];

        // Proses Input
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("--- Input Data Mahasiswa ke-" + (i + 1) + " ---");
            for (int j = 0; j < jumlahMapel; j++) {
                System.out.print("Masukkan nilai Mapel ke-" + (j + 1) + ": ");
                nilai[i][j] = scan.nextInt();
            }
        }

        // Judul
        System.out.println("\n=======================");
        System.out.println(" LAPORAN NILAI SISWA ");
        System.out.println("=======================");

        // Proses Output + Hitung Rata-rata
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int total = 0;
            System.out.print("Siswa " + (i + 1) + ": ");

            for (int j = 0; j < jumlahMapel; j++) {
                System.out.print(nilai[i][j] + " | ");
                total += nilai[i][j];
            }

            double rata = (double) total / jumlahMapel;
            System.out.println("=> Rata-rata: " + rata);
        }

        scan.close();
    }
}
