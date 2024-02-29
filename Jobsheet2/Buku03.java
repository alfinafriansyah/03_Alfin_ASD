package Jobsheet2;

public class Buku03 {
    String judul, pengarang;
    int halaman, stok, harga, totalHarga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }
    void terjual(int jml) {
        if(stok > 0){
            stok -= jml;
        }else{
            System.out.println("Stok Kosong!");
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    int hitungHargaTotal(int jml) {
        return harga * jml;
    }
    public Buku03(){

    }
    public Buku03(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    double hitungDiskon(double hitungHargaTotal) {
        if (totalHarga > 150000) {
            return 0.15 * totalHarga;
        } else if (totalHarga >= 75000 && totalHarga <= 150000) {
            return 0.05 * totalHarga;
        } else {
            return 0;
        } 
    }
    double hitungHargaBayar(int jml) {
        double totalHarga = hitungHargaTotal(jml);
        double diskon = hitungDiskon(jml);
        return totalHarga - diskon;
    }
}
