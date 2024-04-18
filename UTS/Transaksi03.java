package UTS;

public class Transaksi03 {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;
    String noRekening;

    public Transaksi03(Rekening03 rekening, double a, double b, double c, String d, String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;
        this.noRekening = rekening.noRekening;
    }

    void tampilkanDataSaldo() {
        System.out.printf("%-20s%-15s%-20s%-20s%-15s%-25s%n",noRekening, saldo, saldoAwal, saldoAkhir, tanggalTransaksi, type);
    }
}
