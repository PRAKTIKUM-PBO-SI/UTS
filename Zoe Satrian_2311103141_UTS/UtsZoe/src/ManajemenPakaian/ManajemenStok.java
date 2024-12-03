package ManajemenPakaian;
/*@author Zoe Satrian / 2311103141 */

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
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan model pakaian: ");
        String model = scanner.nextLine();

        Pakaian pakaianPria = new Pakaian(nama, jumlah, harga, "Pria", model);
        daftarPakaian.add(pakaianPria);
        System.out.println("Pakaian pria berhasil ditambahkan!\n");
    }

    public void tambahPakaianWanita() {
        System.out.print("Masukkan nama pakaian: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jumlah stok: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan bahan pakaian: ");
        String bahan = scanner.nextLine();

        Pakaian pakaianWanita = new Pakaian(nama, jumlah, harga, "Wanita", bahan);
        daftarPakaian.add(pakaianWanita);
        System.out.println("Pakaian wanita berhasil ditambahkan!\n");
    }

    public void tampilkanSemuaBarang() {
        if (daftarPakaian.isEmpty()) {
            System.out.println("Tidak ada pakaian yang tercatat.\n");
        } else {
            System.out.println("Daftar Semua Pakaian:");
            for (Pakaian pakaian : daftarPakaian) {
                pakaian.tampilkanData();
            }
        }
    }
}