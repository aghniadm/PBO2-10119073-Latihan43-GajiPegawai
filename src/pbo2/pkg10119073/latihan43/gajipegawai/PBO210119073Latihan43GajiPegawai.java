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

public class PBO210119073Latihan43GajiPegawai {

    public static void main(String[] args) {
        GajiPegawai pegawai = new GajiPegawai();
        
        pegawai.tampilData(pegawai.getNama(), pegawai.getAlamat(),
                           pegawai.getUangTransport(), pegawai.getUangTunjangan(),
                           pegawai.getGajiPokok(), pegawai.getTotalGaji());
    }
}
