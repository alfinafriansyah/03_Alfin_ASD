package Jobsheet15;
import java.util.Scanner;

public class GraphMain03 {
    public static void main(String[] args) throws Exception {
        // Graph03 gedung = new Graph03(6);
        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);

        // //Percobaan 1
        // gedung.degree(0);
        // gedung.printGraph();

        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // //Modifikasi Percobaan 1 Nomor 5
        // Scanner sc = new Scanner(System.in);
        // int asal, tujuan;

        // System.out.print("Masukkan inputan: ");
        // int input = sc.nextInt();

        // for (int i = 0; i < input; i++) {
        //     System.out.print("Masukkan gedung asal: ");
        //     asal = sc.nextInt();
        //     System.out.print("Masukkan gedung tujuan: ");
        //     tujuan = sc.nextInt();
        //     if (gedung.ifTrue(asal, tujuan)) {
        //         System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        //     } else {
        //         System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        //     }
        //     System.out.println();
        // }
        // sc.close();
        // // Percobaan 2
        // GraphMatriks03 gdg = new GraphMatriks03(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();

        // // Menampilkan inDegree dan outDegree
        // for (int i = 0; i < 4; i++) {
        //     System.out.println("Gedung " + (char) ('A' + i) + ":");
        //     System.out.println("  inDegree: " + gdg.inDegree(i));
        //     System.out.println("  outDegree: " + gdg.outDegree(i));
        // }


        // Tugas Jobsheet 15
        Scanner sc = new Scanner(System.in);
        GraphMatriks03 gdg = new GraphMatriks03(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan asal: ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc.nextInt();
                    gdg.makeEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = sc.nextInt();
                    gdg.removeEdge(asal, tujuan);
                    break;
                case 3:
                    for (int i = 0; i < 4; i++) {
                        System.out.println("Gedung " + (char) ('A' + i) + ":");
                        System.out.println("  inDegree: " + gdg.inDegree(i));
                        System.out.println("  outDegree: " + gdg.outDegree(i));
                    }
                    break;
                case 4:
                    gdg.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan = sc.nextInt();
                    if (gdg.hasEdge(asal, tujuan)) {
                        System.out.println("Edge ada.");
                    } else {
                        System.out.println("Edge tidak ada.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan asal: ");
                    asal= sc.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    tujuan= sc.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = sc.nextInt();
                    gdg.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    System.out.println("Jumlah edge dalam graf: " + gdg.hitungEdge());
                    break;
                case 8:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
