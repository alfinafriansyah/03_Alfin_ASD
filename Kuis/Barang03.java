package Kuis;

import java.util.Scanner;

public class Barang03 {
    public Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int harga;
    public int stok;

    Barang03(){

    }

    Barang03(String kd, String name, int hrg, int stk){
        kode = kd;
        nama = name;
        harga = hrg;
        stok = stk;
    }
    
    public String getKode() {
        return kode;
    }
 
    public String getNama() {
        return nama;
    }
 
    public double getHarga() {
        return harga;
    }
 
    public int getStok() {
        return stok;
    }
 
    public void setStok(int stok) {
        this.stok = stok;
    }
}
