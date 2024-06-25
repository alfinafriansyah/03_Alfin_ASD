import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        CustomLinkedList03 customList = new CustomLinkedList03();
        customList.add(new Mahasiswa03("003", "Alfin", "01-02-2005"));
        customList.add(new Mahasiswa03("001", "Firman", "15-12-2004"));
        customList.add(new Mahasiswa03("004", "Septa", "13-05-2004"));
        customList.add(new Mahasiswa03("002", "Iga", "15-11-2003"));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Urutkan Mahasiswa berdasarkan NIM");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    customList.add(new Mahasiswa03(nim, nama, tglLahir));
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    nim = scanner.nextLine();
                    customList.delete(nim);
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    nim = scanner.nextLine();
                    Mahasiswa03 mhs = customList.search(nim);
                    if (mhs != null) {
                        System.out.println("Mahasiswa ditemukan: " + mhs);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 4:
                    customList.printAll();
                    break;
                case 5:
                    customList.sort();
                    System.out.println("Mahasiswa telah diurutkan.");
                    customList.printAll();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
