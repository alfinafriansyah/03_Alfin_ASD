public class Mahasiswa03 {
    String nim;
    String nama;
    String tglLahir;

    public Mahasiswa03(String nim, String nama, String tglLahir) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
    }

    @Override
    public String toString() {
        return String.format("NIM: %s, Nama: %s, Tgl Lahir: %s", nim, nama, tglLahir);
    }
}
