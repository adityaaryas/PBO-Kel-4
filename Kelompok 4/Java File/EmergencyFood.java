import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmergencyFood {
    private int idPermintaan;
    private Date tanggalPermintaan;
    private String kategoriPermintaan;
    private String statusPermintaan;
    private Akun penerimaDonasi;
    private List<Donasi> daftarDonasi;
//    private RoomChat roomChat;

    public EmergencyFood(int idPermintaan, Date tanggalPermintaan, String kategoriPermintaan, String statusPermintaan, Akun penerimaDonasi, List<Donasi> daftarDonasi) {
        this.idPermintaan = idPermintaan;
        this.tanggalPermintaan = tanggalPermintaan;
        this.kategoriPermintaan = kategoriPermintaan;
        this.statusPermintaan = statusPermintaan;
        this.penerimaDonasi = penerimaDonasi;
        this.daftarDonasi = daftarDonasi;
    }

    public int getIdPermintaan() {
        return idPermintaan;
    }

    public Date getTanggalPermintaan() {
        return tanggalPermintaan;
    }

    public String getKategoriPermintaan() {
        return kategoriPermintaan;
    }

    public String getStatusPermintaan() {
        return statusPermintaan;
    }

    public Akun getPenerimaDonasi() {
        return penerimaDonasi;
    }

    public List<Donasi> getDaftarDonasi() {
        return daftarDonasi;
    }

    public void setIdPermintaan(int idPermintaan) {
        this.idPermintaan = idPermintaan;
    }

    public void setTanggalPermintaan(Date tanggalPermintaan) {
        this.tanggalPermintaan = tanggalPermintaan;
    }

    public void setKategoriPermintaan(String kategoriPermintaan) {
        this.kategoriPermintaan = kategoriPermintaan;
    }

    public void setStatusPermintaan(String statusPermintaan) {
        this.statusPermintaan = statusPermintaan;
    }

    public void setPenerimaDonasi(Akun penerimaDonasi) {
        this.penerimaDonasi = penerimaDonasi;
    }

    public void setDaftarDonasi(List<Donasi> daftarDonasi) {
        this.daftarDonasi = daftarDonasi;
    }
    
    }

//    public EmergencyFood(int idPermintaan, String kategoriPermintaan, Akun penerimaDonasi) {
//        this.idPermintaan = idPermintaan;
//        this.tanggalPermintaan = new Date();
//        this.kategoriPermintaan = kategoriPermintaan;
//        this.statusPermintaan = "Belum Selesai";
//        this.penerimaDonasi = penerimaDonasi;
//        this.daftarDonasi = new ArrayList<>();
//        this.roomChat = new RoomChat();
//    }
//
//    public void mintaDonasi(double jumlahDonasi, String alamat) {
//        Donasi donasi = new Donasi(generateIdDonasi(), penerimaDonasi.getUsername(), (long) jumlahDonasi, kategoriPermintaan, alamat);
//        donasi.tambahDonasiKeAkun(penerimaDonasi);
//        daftarDonasi.add(donasi);
//    }
//
//    public void setBerhasil() {
//        this.statusPermintaan = "Berhasil";
//    }
//
//    public void setBelumSelesai() {
//        this.statusPermintaan = "Belum Selesai";
//    }
//
//    public void tampilkanDataPermintaan() {
//        System.out.println("ID Permintaan: " + idPermintaan);
//        System.out.println("Tanggal Permintaan: " + tanggalPermintaan);
//        System.out.println("Kategori Permintaan: " + kategoriPermintaan);
//        System.out.println("Penerima Donasi: " + penerimaDonasi.getUsername());
//        System.out.println("Status Permintaan: " + statusPermintaan);
//    }
//
//    private int generateIdDonasi() {
//        return 0;
//    }
//
//    public void mulaiChat() {
//        roomChat.mulaiChat(penerimaDonasi);
//    }
//
//    public void kirimPesan(String pesan) {
//        roomChat.kirimPesan(pesan);
//    }
//
//    private class RoomChat {
//
//        public RoomChat() {
//        }
//
//        public void kirimPesan(String pesan) {
//        }
//
//        public void mulaiChat(Akun penerimaDonasi) {
//        }

//}
