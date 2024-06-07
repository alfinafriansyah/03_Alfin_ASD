package Jobsheet16.Tugas;

public class MataKuliah03 {
    String kode;
    String matkul;
    int sks;

    public MataKuliah03(String kode, String matkul, int sks) {
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getMatkul() {
        return matkul;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-30s %-5d", kode, matkul, sks);
    }
}