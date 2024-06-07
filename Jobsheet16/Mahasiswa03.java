package Jobsheet16;

public class Mahasiswa03 {
    String nim;
    String nama;
    String noTelp;

    public Mahasiswa03() {

    }

    public Mahasiswa03(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + nim + ", nama=" + nama + ", noTelp=" + noTelp + "}";
    } 
}
