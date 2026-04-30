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
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user, pass;
        boolean loginSukses = false;
        int percobaan = 0;
        
        // Maksimal 3 kali percobaan
        while (percobaan < 3 && !loginSukses) {
            System.out.println("--- LOGIN ---");
            System.out.print("Username: ");
            user = scan.nextLine();
            System.out.print("Password: ");
            pass = scan.nextLine();

            // Cek login (Username: admin, Password: 123)
            if (user.equals("admin") && pass.equals("123")) {
                loginSukses = true;
                System.out.println("\nSelamat datang, Admin!");
            } else {
                percobaan++;
                System.out.println("Login gagal! Sisa percobaan: " + (3 - percobaan));
            }
        }

        if (!loginSukses) {
            System.out.println("Akun diblokir!");
        }

        scan.close();
    }
}
