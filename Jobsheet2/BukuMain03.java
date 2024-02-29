package Jobsheet2;

public class BukuMain03 {
    public static void main(String[] args) {
        Buku03 bk03 = new Buku03();
        bk03.judul = "Today Ends Tomorrow Comes";
        bk03.pengarang = "Denanda Pratiwi";
        bk03.halaman = 198;
        bk03.stok = 13;
        bk03.harga = 71000;

        bk03.tampilInformasi();
        bk03.terjual(5);
        bk03.gantiHarga(60000);
        bk03.tampilInformasi();

        Buku03 bk2 = new Buku03("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        int jumlahBukuTerjual = 5;
        double hargaFinal = bk03.hitungHargaBayar(jumlahBukuTerjual);
        System.out.println("Harga setelah diskon: Rp. " + hargaFinal);

        // Buku03 bukuAlfin = new Buku03("Laskar Pelangi", "Andrea Hirata", 200, 50, 75000);
        // bukuAlfin.tampilInformasi();
    }
}
