/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.LatihanPertemuan1;

/**
 *
 * @author Hype GLK
 */
public class RunHewan {
    public static void main(String[] args) {

        // Polymorphism (tipe parent, object child)
        Hewan h1 = new Kucing("Kitty");
        Hewan h2 = new Anjing("Doggy");

        h1.bersuara();
        h2.bersuara();
    }
}
