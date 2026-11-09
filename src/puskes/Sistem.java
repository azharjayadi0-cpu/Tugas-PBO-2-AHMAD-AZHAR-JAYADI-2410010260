package puskes;

import java.util.ArrayList;

public class Sistem {
    
    // Properti individu
    private String antrean;
    private String jadwalDokter;
    
    // Properti koleksi / list
    private ArrayList<String> daftarPengguna;
    private ArrayList<String> daftarAdmin;
    
    // Constructor Kosong 
    public Sistem() {
        this.daftarPengguna = new ArrayList<>();
        this.daftarAdmin = new ArrayList<>();
    }
    
    // --- GETTER & SETTER ---
    
    public String getAntrean() {
        return this.antrean;
    }

    public void setAntrean(String antrean) {
        this.antrean = antrean;
    }

    public String getJadwalDokter() {
        return this.jadwalDokter;
    }

    public void setJadwalDokter(String jadwalDokter) {
        this.jadwalDokter = jadwalDokter;
    }
    
    // --- METHOD UNTUK ARRAYLIST ---
    
    public void inputPengguna(String nama) {
        this.daftarPengguna.add(nama);
    }
    
    public ArrayList<String> listDaftarPengguna() {
        return this.daftarPengguna;
    }

    public void inputAdmin(String admin) {
        this.daftarAdmin.add(admin);
    }
    
    public ArrayList<String> listDaftarAdmin() {
        return this.daftarAdmin;
    }
}