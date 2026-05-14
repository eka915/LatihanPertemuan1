/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class DemoPolimorfisme {
    public static void main(String[]args) {
        // 1. Normal (Reference = Object)
        Hewan h1 = new Hewan();
        h1.bersuara(); // Output: Hewan membuat suara...
        
        // 2. POLIMORFISME (Reference Parent, Object Child)
        Hewan h2 = new Kucing(); //Variabel Hewan menampung objec Kucing
        h2.bersuara(); //Output: Meong... Meong... (Method Anjing yang jalan!)
        
        Hewan h3 = new Anjing();
        h3.bersuara();
    }
}
