/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class Product {
    // 1. Atribut private
    private String namaProduk;
    private double harga;
    private int stok;

    // 2. Constructor
    public Product(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;

        // Validasi stok awal
        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Stok awal tidak valid, diset ke 0.");
        }
    }

    // 3. Getter
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // 4. Setter hanya untuk stok
    public void setStok(int stokBaru) {
        if (stokBaru >= 0) {
            this.stok = stokBaru;
        } else {
            System.out.println("Stok tidak boleh negatif!");
        }
    }

    // 5. Method tambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambah. Stok sekarang: " + stok);
        } else {
            System.out.println("Jumlah harus lebih dari 0!");
        }
    }

    // Method kurangi stok
    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && stok - jumlah >= 0) {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi. Stok sekarang: " + stok);
        } else {
            System.out.println("Stok tidak cukup atau jumlah tidak valid!");
        }
    }
}
