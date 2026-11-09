package puskes;
import CRUD.convigdb;

public class Puskes {

    public static void main(String[] args) {
        new convigdb();
        new layout.frameUtama().setVisible(true);

        System.out.println("=== MULAI PROGRAM ===");

        // Membuat object dari class Child (yang otomatis membawa sifat Parent)
        Registrasi_pasien pasien1 = new Registrasi_pasien();

        // Mengisi data pasien menggunakan Setter
        pasien1.setNamaLengkap("Budi Santoso");
        pasien1.setNoHp(81234567);
        pasien1.setJenisKelamin("Laki-laki");
        pasien1.setAlamat("Jl. Ahmad Yani No. 10");
        
        // Mengisi data sistem (diwarisi dari class Sistem) menggunakan Setter
        pasien1.setAntrean("A-001");
        pasien1.setJadwalDokter("07-05-2026");

        // Memasukkan data ke dalam ArrayList melalui method
        pasien1.inputDataNama("Budi Santoso"); // Ke ArrayList Pasien
        pasien1.inputPengguna("Budi");         // Ke ArrayList Sistem
        pasien1.inputPengguna("Siti");
        pasien1.inputAdmin("Admin Pusat");     // Ke ArrayList Sistem

        // Menampilkan Data Utama
        pasien1.viewData();

        // Menampilkan Data List/Array
        System.out.println("\nDaftar Pengguna Sistem:");
        for (String pengguna : pasien1.listDaftarPengguna()) {
            System.out.println("- " + pengguna);
        }

        System.out.println("\nDaftar Admin Sistem:");
        for (String admin : pasien1.listDaftarAdmin()) {
            System.out.println("- " + admin);
        }

        System.out.println("=== PROGRAM SELESAI ===");
    }
}