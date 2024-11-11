/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsizmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super (jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    
    @Override
    public void informasi(){
        System.out.println("INFORMASI KOMPUTER");
        System.out.println("Jumlah Komputer: "+jumlahKomputer);
        System.out.println("Nama Warnet    : "+namaWarnet);
        System.out.println("Harga Per Jam  : Rp"+hargaPerJam);
        if(ruangPrivat == true){
            System.out.println("Status : Ruang Premium");
            System.out.println("");
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruang Kompartermen Full AC Private");
            System.out.println("- Sofa Gaming RGB nambah FPS");
            System.out.println("- Komputer spek rata kanan, Jaminan FPS tumpah-tumpah");
            System.out.println("- Koneksi internet nasa");
        }else{
            System.out.println("Status : Ruang Standar");
            System.out.println("");
            System.out.println("Fasilitas Ruang Standar:");
            System.out.println("- Ruang Ekonomi PSO Kipas Angin");
            System.out.println("- Sofa dinasti ying");
            System.out.println("- Komputer spek biasa aja");
            System.out.println("- Koneksi internet biasa aja");
        }
    }
    
    public void Pesan(int nomorKomputer){
        System.out.println("Memesan komputer nomor : "+nomorKomputer);
    }
    
    public void tambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan : "+makanan);
    }
    
    public void tambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan : "+makanan+" dan minuman "+minuman);
    }
    
}
