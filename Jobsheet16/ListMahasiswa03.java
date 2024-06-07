package Jobsheet16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMahasiswa03 {
    List<Mahasiswa03> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa03... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa03 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public int binarySearch(String nim) {
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim)); // Mengurutkan berdasarkan NIM
        return Collections.binarySearch(mahasiswas, new Mahasiswa03(nim, null, null), (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortAscending() {
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa03 lm = new ListMahasiswa03();
        Mahasiswa03 m = new Mahasiswa03("201234", "Noureen", "021xx1");
        Mahasiswa03 m1 = new Mahasiswa03("201235", "Akhleema", "021xx2");
        Mahasiswa03 m2 = new Mahasiswa03("201236", "Shannum", "021xx3");

        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();

        // update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa03("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
