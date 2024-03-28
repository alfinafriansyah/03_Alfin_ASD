package Jobsheet7;

import java.util.Scanner;

public class MahasiswaMain03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        int jumMhs = 5;
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int maxSize = s.nextInt();

        PencarianMhs03 data = new PencarianMhs03(maxSize);

        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM dari terkecil");
        for (int i = 0; i < maxSize; i++) {
            System.out.println("-----------------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa03 m = new Mahasiswa03(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("---------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa: ");
        data.tampil();

        System.out.println("---------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        String cari = s.next();

        System.out.println("=========================================");
        System.out.println("Menggunakan binary search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
