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
public class PerpustakaanMini {
    // Array buku (bisa diakses semua method)
    static String[] daftarBuku = {
        "Laskar Pelangi",
        "Bumi",
        "Negeri 5 Menara",
        "Dilan 1990",
        "Ayat-Ayat Cinta"
    };

    // 1. Method menampilkan daftar buku
    static void tampilDaftarBuku() {
        System.out.println("=== DAFTAR BUKU ===");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + ". " + daftarBuku[i]);
        }
    }

    // 2. Method mencari buku
    static boolean cariBuku(String judul) {
        for (int i = 0; i < daftarBuku.length; i++) {
            // equalsIgnoreCase biar tidak sensitif huruf besar/kecil
            if (daftarBuku[i].equalsIgnoreCase(judul)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Tampilkan daftar buku
        tampilDaftarBuku();

        // Input judul buku
        System.out.print("\nMasukkan judul buku yang dicari: ");
        String inputJudul = scan.nextLine();

        // Panggil method cari
        if (cariBuku(inputJudul)) {
            System.out.println("Buku tersedia");
        } else {
            System.out.println("Buku tidak ditemukan");
        }

        scan.close();
    }
}
