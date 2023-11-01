
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
class DaftarDonasi {
    private ArrayList<Donasi> daftarDonasi;
    private int jumlahDonasi;
    
    public void simpanDonasi(Donasi donasi) {
        daftarDonasi.add(donasi);
        jumlahDonasi++;
    }
}
