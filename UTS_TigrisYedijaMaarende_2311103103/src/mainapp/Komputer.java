/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainapp;

/**
 *
 * @author Tigris Yedija Maarende
 * 2311103103
 */
class Komputer {
    protected int totalKomputer;
    protected String namaCafe;
    protected float tarifPerJam;

    public Komputer(int totalKomputer, String namaCafe, float tarifPerJam) {
        this.totalKomputer = totalKomputer;
        this.namaCafe = namaCafe;
        this.tarifPerJam = tarifPerJam;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Cafe: " + namaCafe);
        System.out.println("Total Komputer: " + totalKomputer);
        System.out.println("Tarif per Jam: Rp" + tarifPerJam);
    }
}








