package Jobsheet16.Tugas;

public class Nilai03 implements Comparable<Nilai03>{
    Mahasiswa03 mahasiswa;
    MataKuliah03 matkul;
    double nilai;

    public Nilai03(Mahasiswa03 mahasiswa, MataKuliah03 matkul, double nilai) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.nilai = nilai;
    }

    public Mahasiswa03 getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah03 getMatkul() {
        return matkul;
    }

    public double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-03s %-30s %-5d %-5.2f", mahasiswa.getNim(), mahasiswa.getNama(), matkul.getMatkul(), matkul.getSks(), nilai);
    }
    public int compareTo(Nilai03 other) {
        return Double.compare(this.nilai, other.nilai);
    }
}