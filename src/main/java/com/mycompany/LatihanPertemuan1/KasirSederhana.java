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
public class KasirSederhana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double totalHarga = 0;
        char pilihan;

        do {
            System.out.print("Masukkan harga barang: ");
            double harga = scan.nextDouble();
            
            totalHarga += harga;

            System.out.print("Ada barang lagi? (y/n): ");
            pilihan = scan.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("\nTotal Harga: " + totalHarga);

        scan.close();
    }
}
