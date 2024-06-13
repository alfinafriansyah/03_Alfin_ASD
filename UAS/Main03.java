package UAS;

import java.util.Scanner;

public class Main03 {
    private static BarangRental03[] daftarKendaraan = new BarangRental03[5];
    private static TransaksiRental03[] daftarTransaksi = new TransaksiRental03[100];
    private static int transaksiCount = 0;
    private static Scanner sc03 = new Scanner(System.in);
    
    public static void main(String[] args) {
        initKendaraan();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            int menu = sc03.nextInt();

            switch (menu) {
                case 1:
                    cetakKendaraan();
                    break;
                case 2:
                    peminjaman();
                    break;
                case 3:
                    cetakTransaksi();
                    break;
                case 4:
                    urutkanTransaksi();
                    cetakTransaksi();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void initKendaraan() {
        daftarKendaraan[0] = new BarangRental03("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
        daftarKendaraan[1] = new BarangRental03("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
        daftarKendaraan[2] = new BarangRental03("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000);
        daftarKendaraan[3] = new BarangRental03("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000);
        daftarKendaraan[4] = new BarangRental03("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000);
    }

    public static void cetakKendaraan() {
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Kendaraan Rental Serba Serbi");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("| Nomor TNKB | Nama Kendaraan  | Jenis      | Tahun | Biaya Sewa Perjam |");
        for (BarangRental03 br : daftarKendaraan) {
            System.out.println(br);
        }
        System.out.println();
    }

    public static void peminjaman() {
        System.out.println("-----------------------------------");
        System.out.println("Masukkan Data Peminjaman");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan Nama Peminjam: ");
        String namaPeminjam = sc03.next();
        sc03.nextLine();
        System.out.print("Masukkan Nomor TNKB: ");
        String nomorTNKB = sc03.nextLine();
        System.out.print("Masukkan Lama Pinjam (jam): ");
        int lamaPinjam = sc03.nextInt();
        System.out.print("Apakah Member (ya/tidak): ");
        String isMember = sc03.next();
    
        BarangRental03 kendaraan = null;
        for (BarangRental03 br : daftarKendaraan) {
            if (br.getNoTNKB().equals(nomorTNKB)) {
                kendaraan = br;
                break;
            }
        }
    
        if (kendaraan == null) {
            System.out.println("Kendaraan tidak ditemukan.");
            return;
        }
    
        if (kendaraan.isDipinjam()) {
            System.out.println("Tidak bisa diproses, kendaraan sudah dipinjam orang lain.");
            return;
        }
    
        int biayaPerJam = kendaraan.getJenisKendaraan().equals("Motor") ? 25000 : 40000;
        double totalBiaya = biayaPerJam * lamaPinjam;
    
        if (isMember.equalsIgnoreCase("ya")) {
            totalBiaya -= 25000;
        }

        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            totalBiaya *= 0.9; 
        } else if (lamaPinjam > 78) {
            totalBiaya *= 0.8;
        }
    
        kendaraan.setDipinjam(true);
        TransaksiRental03 transaksi = new TransaksiRental03(totalBiaya, kendaraan, namaPeminjam, lamaPinjam, totalBiaya);
        daftarTransaksi[transaksiCount++] = transaksi;
    
        System.out.println("Transaksi berhasil!");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("| No TNKB  | Nama Barang   | Nama Peminjam | Lama Pinjam | Total Biaya |");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("| %-8s | %-12s | %-13s | %-11d | %-11.2f |\n",  
                          kendaraan.getNoTNKB(), kendaraan.getNamaKendaraan(), namaPeminjam, lamaPinjam, totalBiaya);
        System.out.println("------------------------------------------------------------------------");
    }

    public static void cetakTransaksi() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Transaksi Peminjaman Rental Serba Serbi");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("| Kode | No TNKB  | Nama Barang   | Nama Peminjam | Lama Pinjam | Total Biaya |");
        for (int i = 0; i < transaksiCount; i++) {
            TransaksiRental03 tr = daftarTransaksi[i];
            BarangRental03 br = tr.getBr();
            if (br != null) {
                System.out.printf("| %-4d | %-8s | %-12s | %-13s | %-11d | %-11.2f |\n", 
                                  tr.getKodeTransaksi(), br.getNoTNKB(), br.getNamaKendaraan(), 
                                  tr.getNamaPeminjam(), tr.getLamaPinjam(), tr.getTotalBiaya());
            } else {
                System.out.println("Transaksi dengan kode " + tr.getKodeTransaksi() + " memiliki referensi kendaraan yang null.");
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("  Semua transaksi berhasil dicetak ");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("TOTAL PENDAPATAN RENTAL SERBA SERBI");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Pendapatan hari ini: " + hitungTotalPendapatan());
    }

    public static int hitungTotalPendapatan() {
        int totalPendapatan = 0;
        for (int i = 0; i < transaksiCount; i++) {
            totalPendapatan += daftarTransaksi[i].getTotalBiaya();
        }
        return totalPendapatan;
    }

    public static void urutkanTransaksi() {
        for (int i = 0; i < transaksiCount - 1; i++) {
            for (int j = 0; j < transaksiCount - i - 1; j++) {
                TransaksiRental03 t1 = daftarTransaksi[j];
                TransaksiRental03 t2 = daftarTransaksi[j + 1];

                char firstCharNamaPeminjam1 = t1.getNamaPeminjam().charAt(0);
                char firstCharNamaPeminjam2 = t2.getNamaPeminjam().charAt(0);

                boolean swap = false;

                if (firstCharNamaPeminjam1 >= 'A' && firstCharNamaPeminjam1 <= 'M') {
                    if (firstCharNamaPeminjam2 >= 'A' && firstCharNamaPeminjam2 <= 'M') {
                        if (t1.getBr().getNoTNKB().compareTo(t2.getBr().getNoTNKB()) < 0) {
                            swap = true;
                        }
                    } else {
                        swap = true;
                    }
                } else {
                    if (firstCharNamaPeminjam2 >= 'A' && firstCharNamaPeminjam2 <= 'M') {
                        swap = false;
                    } else {
                        if (t1.getNamaPeminjam().compareTo(t2.getNamaPeminjam()) < 0) {
                            swap = true;
                        }
                    }
                }

                if (swap) {
                    TransaksiRental03 temp = daftarTransaksi[j];
                    daftarTransaksi[j] = daftarTransaksi[j + 1];
                    daftarTransaksi[j + 1] = temp;
                }
            }
        }

        System.out.println("Transaksi berhasil diurutkan.");
    }
    
}
