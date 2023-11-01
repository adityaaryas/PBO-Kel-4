import java.util.ArrayList;
import java.util.List;

public class ResepMakanan {
    private String namaMakanan;
    private ArrayList<String> daftarBahan = new ArrayList<>();
    private List<String> daftarAlat;
    private List<String> langkahLangkah;
    private String gambarMakanan;
    private double rating;
//    
//    public ResepMakanan(String namaMakanan, List<String> daftarBahan, List<String> daftarAlat, List<String> langkahLangkah, String gambarMakanan) {
//        this.namaMakanan = namaMakanan;
//        this.daftarBahan = daftarBahan;
//        this.daftarAlat = daftarAlat;
//        this.langkahLangkah = langkahLangkah;
//        this.gambarMakanan = gambarMakanan;
//        this.rating = 0.0; // Awalnya rating diinisialisasi dengan 0
//    }
//    
//    public String getNamaMakanan() {
//        return namaMakanan;
//    }
//
//    public List<String> getDaftarBahan() {
//        return daftarBahan;
//    }
//
//    public List<String> getDaftarAlat() {
//        return daftarAlat;
//    }
//
//    public List<String> getLangkahLangkah() {
//        return langkahLangkah;
//    }
//
//    public String getGambarMakanan() {
//        return gambarMakanan;
//    }
//
//    public double getRating() {
//        return rating;
//    }
//
//    public void beriRating(double rating) {
//        if (rating >= 0.0 && rating <= 5.0) { // Pastikan rating berada dalam rentang 0 hingga 5
//            this.rating = rating;
//        } else {
//            System.out.println("Rating harus berada dalam rentang 0 hingga 5.");
//        }
//    }
//
//    public void tampilkanInformasiResep() {
//        System.out.println("Nama Makanan: " + namaMakanan);
//        System.out.println("Daftar Bahan:");
//        for (String bahan : daftarBahan) {
//            System.out.println("- " + bahan);
//        }
//        System.out.println("Daftar Alat:");
//        for (String alat : daftarAlat) {
//            System.out.println("- " + alat);
//        }
//        System.out.println("Langkah-langkah:");
//        int langkahKe = 1;
//        for (String langkah : langkahLangkah) {
//            System.out.println(langkahKe + ". " + langkah);
//            langkahKe++;
//        }
//        System.out.println("Gambar Makanan: " + gambarMakanan);
//        System.out.println("Rating: " + rating);
//    }
}
