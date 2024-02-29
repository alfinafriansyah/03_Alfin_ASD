package Jobsheet3;

import java.util.Scanner;

public class infoMahasiswaMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ipk;
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int input = sc.nextInt();
        double totalIpk = 0; 

        infoMahasiswa03[] arrayinfoMahasiswa03 = new infoMahasiswa03[input];

        for (int i = 0; i < arrayinfoMahasiswa03.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = sc.next();
            System.out.print("Masukkan NIM: ");
            String nim = sc.next();
            System.out.print("Masukkan jenis kelamin (l/p): ");
            char jk = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();

            arrayinfoMahasiswa03[i] = new infoMahasiswa03(nama, nim, jk, ipk);
            totalIpk += ipk;
        }
        int index = 0;
        for (infoMahasiswa03 mahasiswa : arrayinfoMahasiswa03) {
            mahasiswa.cetak(index);
            index++;
        }
        if (input != 0) {
            double avgipk = totalIpk/input;
            System.out.println("Rata rata IPK : " + avgipk);
        } else {
            System.out.println("Tidak ada mahasiswa!");
        }
    }
}
