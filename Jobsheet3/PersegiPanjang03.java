package Jobsheet3;

public class PersegiPanjang03 {
    public int panjang;
    public int lebar;

    public PersegiPanjang03(){

    }

    public PersegiPanjang03(int p, int l){
        panjang = p;
        lebar = l;
    }

    void cetakInfo(int i){
        System.out.print("Persegi panjang ke-" + (i+1) + ", panjang: " + panjang + ", lebar: " + lebar + ", ");
    }

    void hitungLuas(){
        int luas = panjang * lebar;
        System.out.print("luas: " + luas +", ");
    }

    void hitungKeliling(){
        int keliling = 2 * (panjang + lebar);
        System.out.print("keliling: " + keliling);
        System.out.println();
    }
}