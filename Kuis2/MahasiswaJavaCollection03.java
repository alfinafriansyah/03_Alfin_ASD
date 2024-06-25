public class MahasiswaJavaCollection03 {
    String nim;
    String nama;
    String tglLahir;

    public MahasiswaJavaCollection03(String nim, String nama, String tglLahir) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Tanggal Lahir: " + tglLahir;
    }
}
