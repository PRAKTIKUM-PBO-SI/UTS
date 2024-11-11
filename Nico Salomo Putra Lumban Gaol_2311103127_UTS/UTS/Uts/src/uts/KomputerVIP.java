/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
class KomputerVIP extends Komputer {
    protected boolean vipCard;
    
    //constructor
    public KomputerVIP(int jumlahKomputer, String namaWarnet, int hargaPerJam) {
           super(jumlahKomputer, namaWarnet, hargaPerJam);
           this.vipCard = vipCard;
    }
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("VIP CARD: " + (vipCard ? "Tersedia" : "Tidak tersedia"));
    }
    //Method Login
    public void login(String Username) {
        System.out.println("User" + Username +" sudah Login :");
    }
    
    public void bermain(int jam){
        System.out.println("User bermain selama" + jam + "jam");
    }
    
    public void menitTambahan(int menitTambahan) {
        System.out.println("Menit tambahan" + menitTambahan + "menit");  
    }  

    
    }
