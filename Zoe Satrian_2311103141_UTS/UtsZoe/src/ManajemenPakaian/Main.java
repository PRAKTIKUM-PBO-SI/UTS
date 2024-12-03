package ManajemenPakaian;
/*@author Zoe Satrian / 2311103141 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManajemenStok manajemenStok = new ManajemenStok();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== Menu Manajemen Stok Toko Pakaian ===");
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
                    running = false;
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
    }
    
    }
    }
}