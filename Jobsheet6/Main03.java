package Jobsheet6;

public class Main03 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi03 list = new DaftarMahasiswaBerprestasi03();
        Mahasiswa03 m1 = new Mahasiswa03("Nusa", 2017, 25, 3);
        Mahasiswa03 m2 = new Mahasiswa03("Rara", 2012, 19, 4);
        Mahasiswa03 m3 = new Mahasiswa03("Dompu", 2018, 19, 3.5);
        Mahasiswa03 m4 = new Mahasiswa03("Abdul", 2017, 23, 2);
        Mahasiswa03 m5 = new Mahasiswa03("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
