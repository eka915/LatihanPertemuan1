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
public class DaftarNamaTamu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Input jumlah tamu
        System.out.print("Masukkan jumlah tamu: ");
        int jumlahTamu = scan.nextInt();
        scan.nextLine(); // buang newline

        // 2. Array untuk menyimpan nama tamu
        String[] tamu = new String[jumlahTamu];

        // Input nama tamu
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.print("Masukkan nama tamu ke-" + (i + 1) + ": ");
            tamu[i] = scan.nextLine();
        }

        // 3. Tampilkan daftar tamu
        System.out.println("\n=== Daftar Nama Tamu ===");
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.println("Tamu " + (i + 1) + ": " + tamu[i]);
        }

        // 4. Hitung nama yang diawali huruf 'A'
        int jumlahA = 0;
        for (int i = 0; i < jumlahTamu; i++) {
            if (tamu[i].startsWith("A") || tamu[i].startsWith("a")) {
                jumlahA++;
            }
        }

        System.out.println("\nJumlah tamu dengan nama diawali huruf A: " + jumlahA);

        scan.close();
    }
}
