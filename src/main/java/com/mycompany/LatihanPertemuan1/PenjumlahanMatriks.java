/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class PenjumlahanMatriks {
     public static void main(String[] args) {

        // 1. Membuat matriks A dan B (2x2)
        int[][] matriksA = {
            {1, 2},
            {3, 4}
        };

        int[][] matriksB = {
            {5, 6},
            {7, 8}
        };

        // 3. Matriks hasil
        int[][] matriksHasil = new int[2][2];

        // Proses penjumlahan
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // 4. Tampilkan Matriks A
        System.out.println("Matriks A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }

        // Tampilkan Matriks B
        System.out.println("Matriks B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriksB[i][j] + " ");
            }
            System.out.println();
        }

        // Tampilkan Hasil
        System.out.println("Hasil Penjumlahan:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriksHasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
