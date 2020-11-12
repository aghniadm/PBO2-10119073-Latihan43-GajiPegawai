package pbo2.pkg10119073.latihan43.gajipegawai;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung gaji pegawai
 *
 */

public class GajiPegawai {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
   
    public int getUangTransport(){
        return uangTransport;
    }
    
    public void setUangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }
    
    public int getUangTunjangan(){
        return uangTunjangan;
    }
    
    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getGajiPokok(){
        return gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji(){
        setTotalGaji(totalGaji);
        return totalGaji;
    }
    
    public void setTotalGaji(int totalGaji){
        totalGaji = totalGaji(getUangTransport(),getUangTunjangan(),getGajiPokok());
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, 
                           int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Aghnia Dewi Mahiranie");
        pegawai.setAlamat("Jalan Pelesiran");
        pegawai.setUangTransport(250000);
        pegawai.setUangTunjangan(300000);
        pegawai.setGajiPokok(4500000);
        
        System.out.println("Nama Karyawan : "+pegawai.getNama());
        System.out.println("Alamat : "+pegawai.getAlamat());
        System.out.println("Uang Transport : Rp. "+pegawai.getUangTransport());
        System.out.println("Uang Tunjangan : Rp. "+pegawai.getUangTunjangan());
        System.out.println("Gaji Pokok : Rp. "+pegawai.getGajiPokok());
        System.out.println("TOTAL GAJI : Rp. "+pegawai.getTotalGaji());
    }
}