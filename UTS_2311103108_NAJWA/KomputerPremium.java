/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Najwa Darmawan
 * 2311103108
 * S1SI07C
 */
    public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println(" Jenis Ruangan : " + (ruangPrivat ? " Ruang Privat " : " Ruang Standar ")); if (ruangPrivat){
    
        System.out.println(" Fasilitas : Kursi Eksklusif dan Privasi Tinggi ");
        }else{
            System.out.println(" Fasilitas : Fasilitas Standar ");
        }
    }

    public void pesan(int nomorKomputer) {
        System.out.println(" Nomor Komputer yang dipesan : " + nomorKomputer);
    }

    public void tambahLayanan(String makanan) {
        System.out.println(" Tambah layanan makanan: " + makanan);
    }
    public void tambahLayanan(String makanan, String minuman) {
        System.out.println(" Anda memesan makanan: " + makanan + " dan minuman : " + minuman);
    }
}
