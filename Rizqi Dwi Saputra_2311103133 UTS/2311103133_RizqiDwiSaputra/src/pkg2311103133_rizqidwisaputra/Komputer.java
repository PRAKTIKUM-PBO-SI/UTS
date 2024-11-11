package pkg2311103133_rizqidwisaputra;
//Rizqi Dwi Saputra_2311103133_S1SI07C

abstract class Komputer {
    
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }
    
    public abstract void Informasi();

    
}
