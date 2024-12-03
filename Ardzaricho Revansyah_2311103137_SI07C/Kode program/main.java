/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_7c_2311103137_ardzarichorevansyah;

/**
 *
 *  @author ARDZARICHO REVANSYAH
 * 2311103137
 * 07C 
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ManajemenStok manajemenStok = new ManajemenStok();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistem Manajemen Stok Pakaian ===");
            System.out.println("1. Tambah Pakaian Pria");
            System.out.println("2. Tambah Pakaian Wanita");
            System.out.println("3. Tampilkan Semua Pakaian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    manajemenStok.tambahPakaianPria();
                    break;
                case 2:
                    manajemenStok.tambahPakaianWanita();
                    break;
                case 3:
                    manajemenStok.tampilkanSemuaBarang();
                    break;
                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}


