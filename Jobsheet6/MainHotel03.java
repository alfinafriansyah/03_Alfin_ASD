package Jobsheet6;

import java.util.Scanner;

public class MainHotel03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService03 list = new HotelService03();
        Hotel03 h1 = new Hotel03("Lojikka", "Tulungagung", 500000, (byte)4);
        Hotel03 h2 = new Hotel03("Ijen", "Malang", 700000, (byte)5);
        Hotel03 h3 = new Hotel03("Palapa", "Blitar", 350000, (byte)3);
        Hotel03 h4 = new Hotel03("Crown", "Tulungagung", 200000, (byte)1);
        Hotel03 h5 = new Hotel03("Istana", "Tulungagung", 300000, (byte)2);
        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        int pilih;
        System.out.println("============================");
        System.out.println("            Sorting         ");
        System.out.println("============================");
        System.out.println("1. Tampilkan Data Hotel (tanpa sorting)");
        System.out.println("2. Urutkan berdasarkan harga (Bubble Sort)");
        System.out.println("3. Urutkan berdasarkan harga (Selection Sort)");
        System.out.println("4. Urutkan berdasarkan bintang (Bubble Sort)");
        System.out.println("5. Urutkan berdasarkan bintang (Selection Sort)");
        System.out.print("Pilih (1-5): ");
        pilih = sc.nextInt();

        switch(pilih){
            case 1:
            System.out.println("Data hotel sebelum sorting: ");
            list.tampil();
            break;

            case 2:
            System.out.println("Data hotel dari harga termurah menggunakan algoritma bubble sort: ");
            list.hargaBubbleSort();
            list.tampil();
            break;

            case 3:
            System.out.println("Data hotel dari harga termurah menggunakan algoritma selection sort: ");
            list.hargaSelectionSort();
            list.tampil();
            break;

            case 4:
            System.out.println("Data dari bintang tertinggi menggunakan algoritma bubble sort: ");
            list.bintangBubbleSort();
            list.tampil();
            break;

            case 5:
            System.out.println("Data dari bintang tertinggi menggunakan algoritma selection sort: ");
            list.bintangSelectionSort();
            list.tampil();
            break;
        }
    }
}