/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan14;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Hype GLK
 */
public class TodoListApp {
     public static void main(String[] args) {
        ArrayList<String> tugas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("\n=== APLIKASI TO-DO LIST ===");
            System.out.println("1. Lihat Tugas");
            System.out.println("2. Tambah Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scan.nextInt();
            scan.nextLine(); // Membersihkan buffer enter

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Tugas ---");
                    if (tugas.isEmpty()) {
                        System.out.println("(Belum ada tugas)");
                    } else {
                        // Tampilkan dengan nomor urut
                        for (int i = 0; i < tugas.size(); i++) {
                            System.out.println((i + 1) + ". " + tugas.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Masukkan tugas baru: ");
                    String tugasBaru = scan.nextLine();
                    tugas.add(tugasBaru);
                    System.out.println("Tugas berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.print("Masukkan nomor tugas yang dihapus: ");
                    int hapusIndex = scan.nextInt();

                    // Validasi index agar tidak error
                    if (hapusIndex > 0 && hapusIndex <= tugas.size()) {
                        String removed = tugas.remove(hapusIndex - 1); // Index ArrayList dimulai dari 0
                        System.out.println("Tugas '" + removed + "' berhasil dihapus");
                    } else {
                        System.out.println("Nomor tugas tidak valid!");
                    }
                    break;

                case 4:
                    System.out.println("Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilihan != 4);

        scan.close();
    }
}