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
public class Latihan14 {
    public static void main(String[] args) {
        ArrayList<String> namaKontak = new ArrayList<>();
        ArrayList<String> nomorKontak = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("\n=== MANAJEMEN KONTAK ===");
            System.out.println("1. Tampilkan Semua Kontak");
            System.out.println("2. Tambah Kontak");
            System.out.println("3. Hapus Kontak");
            System.out.println("4. Cari Kontak");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n--- Daftar Kontak ---");
                    if (namaKontak.isEmpty()) {
                        System.out.println("(Belum ada kontak)");
                    } else {
                        for (int i = 0; i < namaKontak.size(); i++) {
                            System.out.println((i + 1) + ". "
                                    + namaKontak.get(i)
                                    + " - "
                                    + nomorKontak.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Masukkan nama: ");
                    String nama = scan.nextLine();

                    System.out.print("Masukkan nomor telepon: ");
                    String nomor = scan.nextLine();

                    namaKontak.add(nama);
                    nomorKontak.add(nomor);

                    System.out.println("Kontak berhasil ditambahkan!");
                    break;

                case 3:
                    System.out.print("Masukkan nomor kontak yang dihapus: ");
                    int hapusIndex = scan.nextInt();

                    if (hapusIndex > 0 && hapusIndex <= namaKontak.size()) {
                        namaKontak.remove(hapusIndex - 1);
                        nomorKontak.remove(hapusIndex - 1);
                        System.out.println("Kontak berhasil dihapus!");
                    } else {
                        System.out.println("Nomor kontak tidak valid!");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = scan.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < namaKontak.size(); i++) {
                        if (namaKontak.get(i).equalsIgnoreCase(cari)) {
                            System.out.println("Nama  : " + namaKontak.get(i));
                            System.out.println("Nomor : " + nomorKontak.get(i));
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Kontak tidak ditemukan!");
                    }
                    break;

                case 5:
                    System.out.println("Sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilihan != 5);

        scan.close();
    }
}
