/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_anggitrefiyan_2311103142;

/**
 *
 * @author Anggit Refiyan
 * 2311103142
 * 7c
 */
public class KomputerVIP extends Komputer{
    protected boolean vipCard;
    
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean vipCard){
    super(jumlahKomputer, namaWarnet, hargaPerjam);
    this.vipCard = vipCard;
    }
    
    @Override
    public void informasi(){
    if(vipCard){    
       System.out.println("benefit vip");
       System.out.println("-diskon 10% bermain diatas 3 jam");
       System.out.println("-geratis minuman setiap 4 jam bermain");
       System.out.println("-prioritas komputer gaming");
    } else {
       System.out.println("jangan ngarep dapet benefit vip"); 
    }
    }
    public void login(String username){
      System.out.println("Login dengan username : " + username);
    }
    
    public void bermain(int jam){
        System.out.println("Bermain dengan selama " + jam);
    }
    
    public void bermain(int jam, int menitTambahan){
        System.out.println("Tambah biling selama" + jam + "jam" + menitTambahan + " menit");
    }
}
