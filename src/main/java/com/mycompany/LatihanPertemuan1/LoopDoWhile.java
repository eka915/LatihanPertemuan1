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
public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("\n=== MENU APLIKASI ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilihan = scan.nextInt();

            switch(pilihan) {
                case 1: System.out.println("Data ditambahkan..."); break;
                case 2: System.out.println("Menampilkan data..."); break;
                case 3: System.out.println("Terima kasih..."); break;
                default: System.out.println("Pilihan tidak ada!");
            }
        } while (pilihan != 3); // Ulangi selama pilihan bukan 3 (Keluar)

        scan.close();
    }
}


