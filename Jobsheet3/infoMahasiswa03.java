package Jobsheet3;

public class infoMahasiswa03 {
    public String nama;
    public String nim;
    public char jk;
    public double ipk;

    public infoMahasiswa03(){

    }

    public infoMahasiswa03(String name, String nm, char jenis_kelamin, double ip){
        nama = name;
        nim = nm;
        jk = jenis_kelamin;
        ipk = ip;
    }

    public void cetak(int i) {
        System.out.println("Data Mahasiswa ke-" + (i+1));
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("IPK: " + ipk);
    }
}
