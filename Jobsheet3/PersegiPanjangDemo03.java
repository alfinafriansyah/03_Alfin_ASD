package Jobsheet3;
import java.util.Scanner;

public class PersegiPanjangDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int length = sc.nextInt();
        PersegiPanjang03[] arrayOfPersegiPanjang = new PersegiPanjang03[length];
        int panjang, lebar;

        for(int i = 0; i < arrayOfPersegiPanjang.length; i++){
            arrayOfPersegiPanjang[i] = new PersegiPanjang03();

            System.out.println("Persegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang03(panjang, lebar);
        }

        for(int i = 0; i < arrayOfPersegiPanjang.length; i++){
            arrayOfPersegiPanjang[i].cetakInfo(i);
            arrayOfPersegiPanjang[i].hitungLuas();
            arrayOfPersegiPanjang[i].hitungKeliling();
        }

        // for(int i = 0; i < 3; i++){
        //     arrayOfPersegiPanjang[i] = new PersegiPanjang03();

        //     System.out.println("Persegi panjang ke-" + (i+1));
        //     System.out.print("Masukkan panjang: ");
        //     arrayOfPersegiPanjang[i].panjang = sc.nextInt();
        //     System.out.print("Masukkan lebar: ");
        //     arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        // }

        // for(int i = 0; i < 3; i++){
        //     System.out.println("Persegi panjang ke-" + (i+1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", lebar: " + arrayOfPersegiPanjang[i].lebar);
        // }

        // arrayOfPersegiPanjang[0] = new PersegiPanjang03();
        // arrayOfPersegiPanjang[0].panjang = 110;
        // arrayOfPersegiPanjang[0].lebar = 30;

        // arrayOfPersegiPanjang[1] = new PersegiPanjang03();
        // arrayOfPersegiPanjang[1].panjang = 80;
        // arrayOfPersegiPanjang[1].lebar = 40;

        // arrayOfPersegiPanjang[2] = new PersegiPanjang03();
        // arrayOfPersegiPanjang[2].panjang = 100;
        // arrayOfPersegiPanjang[2].lebar = 20;

        // System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang + ", lebar: " + arrayOfPersegiPanjang[0].lebar);
        // System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang + ", lebar: " + arrayOfPersegiPanjang[1].lebar);
        // System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang + ", lebar: " + arrayOfPersegiPanjang[2].lebar);
    }
}
