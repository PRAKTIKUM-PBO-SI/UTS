/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riska.vany.dewi_2311103111;

/**
 *
 * @author ASUS
 */

class KomputerPremium extends Komputer{
    protected boolean ruangPrivat;
    
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
    }
    
    @Override
    public void informasi(){
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : " +jumlahKomputer);
        System.out.println("Nama Warnet     : " +namaWarnet);
        System.out.println("Harga Per Jam   : " +hargaPerJam);
        System.lineSeparator();
        
        
        if (ruangPrivat) {
            System.out.println("Status      : Ruangan Premium");
            System.out.println("Fasilitas Ruang Premium:");
            System.out.println("- Ruangan ber-AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Koneksi internet dedicated 100Mbps");
        }else{
            System.out.println("Status      : Ruangan Standart");
            System.out.println("Fasilitas Ruang Standart:");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa majapahit");
            System.out.println("- Koneksi internet dedicated 1Mbps");
        }
    }
    
    public void pesan(){
        System.out.println("Memesan komputer nomor  : 5");
        
    }
    
    public void tambahLayanan(){
        System.out.println("Menambah layanan makanan    : Mie Goreng");
    }
    
    public void tambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan    : Mie goreng dan minuman: Es Teh");
    }
}    
