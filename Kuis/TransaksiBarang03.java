package Kuis;

import java.util.Scanner;

public class TransaksiBarang03 {
    Barang03[] barangs = new Barang03[100];
    Barang03[] pembelians = new Barang03[100];
    public int jumlahBarang;
    public int jumlahPembelian;
    public TransaksiBarang03(){
        barangs[jumlahBarang++] = new Barang03("K01", "Roti", 2500, 500);
        barangs[jumlahBarang++] = new Barang03("K02", "Susu", 4000, 140);
        barangs[jumlahBarang++] = new Barang03("K03", "Aqua", 3000, 200);
        barangs[jumlahBarang++] = new Barang03("K04", "Sabun", 3500, 421);
        barangs[jumlahBarang++] = new Barang03("K05", "Shampo", 4000, 240);
    }
    public void tampilkanBarang() {
        System.out.println("=========================");
        System.out.println("     Daftar Barang       ");
        System.out.println("=========================");
        System.out.println("Kode\tNama\tHarga\tStok");
        for (int i = 0; i < jumlahBarang; i++) {
            Barang03 barang = barangs[i];
            System.out.println(barang.getKode() + "\t" + barang.getNama() + "\t" + barang.getHarga() + "\t" + barang.getStok());
        }
    }
    public void tampilkanBarangPembelian() {
        System.out.println("===========================");
        System.out.println("       Daftar Pembelian     ");
        System.out.println("===========================");
        System.out.println("Kode\tNama\tHarga\tStok");
        for (int i = 0; i < jumlahPembelian; i++) {
            Barang03 barang = pembelians[i];
            System.out.println(barang.getKode() + "\t" + barang.getNama() + "\t" + barang.getHarga() + "\t" + barang.getStok());
        }
        System.out.println();
    }
 
    public void melakukanPembelian() {
        Scanner sc = new Scanner(System.in);
        Barang03 barangDibeli;
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = sc.next();
        barangDibeli = null;
        for (int i = 0; i < jumlahBarang; i++) {
            Barang03 barang = barangs[i];
            if (barang.getKode().equalsIgnoreCase(kodeBarang)) {
                barangDibeli = barang;
                break;
            }
        }
        if (barangDibeli != null && barangDibeli.getStok() > 0) {
            pembelians[jumlahPembelian++] = barangDibeli;
            barangDibeli.setStok(barangDibeli.getStok() - 1);
            System.out.println("Pembelian berhasil!");
            System.out.print("Apakah akan belanja kembali(Y/N)? ");
            String pilih = sc.next();
            if (pilih.equalsIgnoreCase("y")) {
                melakukanPembelian();
            } else {
                System.out.println("Terima Kasih!");
            }
        } else {
            System.out.println("Barang tidak ditemukan atau stok habis.");
            melakukanPembelian();
        }
    }
}