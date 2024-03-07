package Kuis;

import java.util.Scanner;

public class MainBarang03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TransaksiBarang03 transaksiBarang = new TransaksiBarang03();
        int pilihan;
        do {
            System.out.println("==========================");
            System.out.println(" TOKO MAJU MUNDUR CANTIK ");
            System.out.println("==========================");
            System.out.println("1. Tampilkan Barang ");
            System.out.println("2. Beli ");
            System.out.println("3. Tampilkan Pembelian ");
            System.out.println("4. Keluar ");
            System.out.print("Pilih [1-4] : ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Membersihkan baris input

            switch (pilihan) {
                case 1:
                    transaksiBarang.tampilkanBarang();
                    break;
                case 2:
                    transaksiBarang.melakukanPembelian();
                    break;
                case 3:
                    transaksiBarang.tampilkanBarangPembelian();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilihan != 0);
    }
}
