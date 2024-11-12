
/**
 *
 * @author Levina
 */
abstract class komputer {
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float hargaPerJam;
    
    public komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam){
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }
    
    public abstract void informasi();
    
}