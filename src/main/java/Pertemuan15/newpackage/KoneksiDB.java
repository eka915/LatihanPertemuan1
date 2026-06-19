/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan15.newpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hype GLK
 */
public class KoneksiDB {
    private static final String URL = "jdbc:mysql://localhost:3306/db_mahasiswa";
    private static final String USER = "root";
    private static final String PASS ="";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver tidak ditemukan! Cek Library JAR.");
        } catch (SQLException e) {
            System.out.println("Error: Koneksi Gagal! Cek URL/User/Pass atau MySQL");
        }
        return conn;
        }
}