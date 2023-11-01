import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class Donasi {
        private char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
        private StringBuilder stringBuilder = new StringBuilder();
        private Random random = new Random();
        private String idDonasi;
        private LocalDate tanggalDonasi;
        private Akun pengirimDonasi;
        private int jumlahDonasi;
        private String statusDonasi;
        private String kategoriDonasi;
        private String alamat;
        private ArrayList<Donasi> daftarDonasi;
//        Donasi[] daftarDonasi = new Donasi[999999999];

    public Donasi(String idDonasi, LocalDate tanggalDonasi, Akun pengirimDonasi, int jumlahDonasi, String statusDonasi, String kategoriDonasi, String alamat) {
        this.idDonasi = idDonasi;
        this.tanggalDonasi = tanggalDonasi;
        this.pengirimDonasi = pengirimDonasi;
        this.jumlahDonasi = jumlahDonasi;
        this.statusDonasi = statusDonasi;
        this.kategoriDonasi = kategoriDonasi;
        this.daftarDonasi = new ArrayList<Donasi>();
        this.alamat = alamat;
    }

    public Donasi(String idDonasi, LocalDate tanggalDonasi, int jumlahDonasi, String statusDonasi, String kategoriDonasi, String alamat) {
        this.idDonasi = idDonasi;
        this.tanggalDonasi = tanggalDonasi;
        this.jumlahDonasi = jumlahDonasi;
        this.statusDonasi = statusDonasi;
        this.kategoriDonasi = kategoriDonasi;
        this.alamat = alamat;
    }

    public Donasi() {
    }

    public LocalDate getTanggalDonasi() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        return tanggalDonasi;
    }

    public String getIdDonasi() {
        for (int length = 0; length < 10; length++){
            Character character = chars[random.nextInt(chars.length)];
            stringBuilder.append(character);
        }
        idDonasi = stringBuilder.toString();
        stringBuilder.delete(0,5);
        
        return idDonasi;
    }

    public Akun getPengirimDonasi() {
        return pengirimDonasi;
    }

    public int getJumlahDonasi() {
        return jumlahDonasi;
    }

    public String getStatusDonasi() {
        return statusDonasi;
    }

    public String getKategoriDonasi() {
        return kategoriDonasi;
    }

    public String getAlamat() {
        return alamat;
    }

    public ArrayList<Donasi> getDaftarDonasi() {
        return daftarDonasi;
    }

    public void setPengirimDonasi(Akun pengirimDonasi) {
        this.pengirimDonasi = pengirimDonasi;
    }

    public void setStatusDonasi(String statusDonasi) {
        this.statusDonasi = statusDonasi;
    }

    public void setJumlahDonasi(int jumlahDonasi) {
        this.jumlahDonasi = jumlahDonasi;
    }

    public void setKategoriDonasi(String kategoriDonasi) {
        this.kategoriDonasi = kategoriDonasi;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTanggalDonasi() {
        LocalDate tanggalDonasi = LocalDate.now();
        this.tanggalDonasi = tanggalDonasi;
    }
    
    public void setSelesai() {
        this.statusDonasi = "Sudah Selesai";
    }

    public void setBelumSelesai() {
        this.statusDonasi = "Belum Selesai";
    }
    
    }

//    private static List<Donasi> daftarDonasi = new ArrayList<>();
//    
//    private int idDonasi;
//    private Date tanggalDonasi;
//    private Akun pengirimDonasi;
//    private long jumlahDonasi;
//    private String statusDonasi;
//    private String kategoriDonasi;
//    private String alamat;
//    private boolean simpanDonasi;
//
//    public Donasi(int idDonasi, String pengirimDonasi, long jumlahDonasi, String kategoriDonasi, String alamat) {
//        this.idDonasi = idDonasi;
//        this.tanggalDonasi = new Date();
//        this.pengirimDonasi = pengirimDonasi;
//        this.jumlahDonasi = jumlahDonasi;
//        this.statusDonasi = "Belum Selesai";
//        this.kategoriDonasi = kategoriDonasi;
//        this.alamat = alamat;
//        this.simpanDonasi = false;
//    }
//
//    public void tambahDonasiKeAkun(Akun akun) {
//        akun.tambahDonasi((int) jumlahDonasi);
//    }
//

//
//    
//    public void tampilkanInformasiDonasi() {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        System.out.println("ID Donasi: " + idDonasi);
//        System.out.println("Tanggal Donasi: " + sdf.format(tanggalDonasi));
//        System.out.println("Pengirim Donasi: " + pengirimDonasi);
//        System.out.println("Jumlah Donasi: " + jumlahDonasi);
//        System.out.println("Status Donasi: " + statusDonasi);
//        System.out.println("Kategori Donasi: " + kategoriDonasi);
//        System.out.println("Alamat: " + alamat);
//    }
//
//    public void simpanDonasi() {
//        simpanDonasi = true;
//    }
//
//    public void batalSimpanDonasi() {
//        simpanDonasi = false;
//    }
//
//    public boolean isDonasiDisimpan() {
//        return simpanDonasi;
//    }
//
//    int getIdDonasi() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}
