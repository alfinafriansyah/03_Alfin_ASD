package UAS;

public class TransaksiRental03 {
    private static int kodeTransaksiCounter = 1;
    private int kodeTransaksi;
    private String namaPeminjam;
    private int lamaPinjam;
    private double totalBiaya;
    private BarangRental03 br;

    public TransaksiRental03(double totalBiaya22, BarangRental03 br, String namaPeminjam, int lamaPinjam, double totalBiaya) {
        this.kodeTransaksi = kodeTransaksiCounter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = lamaPinjam * br.getBiayaSewa();
    }

    public TransaksiRental03(String namaPeminjam2, BarangRental03 br, String namaKendaraan, int lamaPinjam2, int totalBiaya2) {
        
    }

    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public BarangRental03 getBr() {
        return br;
    }

    @Override
    public String toString() {
        return String.format("| %-14d | %-12s | %-20s | %-12s | %-10d | %-10.2f |", 
                             kodeTransaksi, br.getNoTNKB(), br.getNamaKendaraan(), 
                             namaPeminjam, lamaPinjam, totalBiaya);
    }
}
