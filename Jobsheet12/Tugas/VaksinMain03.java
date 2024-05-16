package Jobsheet12.Tugas;

import java.util.Scanner;

public class VaksinMain03 {
    public static void main(String[] args) {
        VaksinQueue03 queue = new VaksinQueue03();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.print("Masukkan pilihan: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.print("Masukkan nomor antrian: ");
                String nomorAntrian = sc.next();
                System.out.print("Masukkan nama penerima: ");
                String nama = sc.next();
                queue.add(nama, nomorAntrian);
                break;
                case 2:
                queue.remove();
                break;
                case 3:
                queue.printQueue();
                break;
                case 4:
                System.out.println("Keluar dari program.");
                System.exit(0);
                break;
                default:
                System.out.println("Opsi tidak valid. Silakan coba lagi.");
                break;
            }
        } while (menu != 5);
    }
}
