/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class TampilkanMatriks {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Isi Matriks:");

        // Loop Baris (i)
        for (int i = 0; i < matriks.length; i++) {

            // Loop Kolom (j)
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }

            // Ganti baris setelah satu baris kolom selesai dicetak
            System.out.println();
        }
    }
}
