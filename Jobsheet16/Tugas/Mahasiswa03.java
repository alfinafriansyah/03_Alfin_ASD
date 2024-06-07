package Jobsheet16.Tugas;

public class Mahasiswa03 {
    String nim;
    String nama;
    String telp;

    public Mahasiswa03(String nim, String nama, String telp) {
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTelp() {
        return telp;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-10s", nim, nama, telp);
    }
}