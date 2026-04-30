/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class RunBank {
    public static void main(String[] args) {

        RekeningBank rek = new RekeningBank("123456", 1000000);

        // Tidak bisa akses langsung:
        // rek.saldo = 100; // ERROR

        // Harus lewat method
        rek.tarik(500000);
        rek.setor(200000);
        rek.tarik(2000000); // Gagal

        System.out.println("Saldo Akhir: Rp " + rek.getSaldo());
    }
}
