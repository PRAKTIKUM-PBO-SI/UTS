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
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenStok {
    private ArrayList<Pakaian> daftarPakaian = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahPakaianPria() {
        System.out.print("Masukkan nama pakaian: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah stok: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan harga pakaian: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Masukkan model pakaian: ");
        String model = scanner.nextLine();

        Pakaian pakaian = new Pakaian(nama, jumlah, harga, "Pria", model);
        daftarPakaian.add(pakaian);
        System.out.println("Pakaian pria berhasil ditambahkan!");
    }

    public void tambahPakaianWanita() {
        System.out.print("Masukkan nama pakaian: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah stok: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan harga pakaian: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Masukkan bahan pakaian: ");
        String bahan = scanner.nextLine();

        Pakaian pakaian = new Pakaian(nama, jumlah, harga, "Wanita", bahan);
        daftarPakaian.add(pakaian);
        System.out.println("Pakaian wanita berhasil ditambahkan!");
    }

    public void tampilkanSemuaBarang() {
        if (daftarPakaian.isEmpty()) {
            System.out.println("Belum ada pakaian yang terdaftar.");
        } else {
            System.out.println("Daftar Semua Pakaian:");
            for (Pakaian pakaian : daftarPakaian) {
                pakaian.tampilkanData();
            }
        }
    }
}
