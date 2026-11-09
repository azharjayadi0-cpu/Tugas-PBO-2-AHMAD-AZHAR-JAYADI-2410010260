package puskes;

import java.util.ArrayList;

// Menggunakan extends untuk mengikuti prosedur Pewarisan 
public class Registrasi_pasien extends Sistem {
    
    private String namaLengkap;
    private int noHp;
    private String jenisKelamin;
    private String alamat;
    
    private ArrayList<String> dataNamaPasien;
    
    // Constructor
    public Registrasi_pasien() {
        super(); // Memanggil constructor dari class Sistem 
        this.dataNamaPasien = new ArrayList<>();
    }
    
    // --- GETTER & SETTER ---
    
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    
    public String getNamaLengkap() {
        return this.namaLengkap;
    }
    
    public void setNoHp(int noHp) {
        this.noHp = noHp;
    }
    
    public int getNoHp() {
        return this.noHp;
    }
    
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getAlamat() {
        return this.alamat;
    }
    
    public void inputDataNama(String nama) {
        this.dataNamaPasien.add(nama);
    }
    
    public ArrayList<String> listDataNama() {
        return this.dataNamaPasien;
    }
    
    // Method tampil data 
    public void viewData() {
        System.out.println("--- Data Registrasi Pasien ---");
        System.out.println("Nama          : " + getNamaLengkap());
        System.out.println("No. HP        : " + getNoHp());
        System.out.println("Jenis Kelamin : " + getJenisKelamin());
        System.out.println("Alamat        : " + getAlamat());
        System.out.println("Antrean       : " + getAntrean());       // Dari Parent
        System.out.println("Jadwal Dokter : " + getJadwalDokter());  // Dari Parent
        System.out.println("------------------------------");
    }
}