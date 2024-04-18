package UTS;

public class Rekening03 {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;

    public Rekening03(String a, String b, String c, String d, String e){
        noRekening = a;
        nama = b;
        namaIbu = c;
        phone = d;
        email = e;
    }

    void tampilkanData(){
        System.out.printf("%-15s%-20s%-20s%-15s%-25s%n", noRekening, nama, namaIbu, phone, email);
        System.out.println();
    }
}
