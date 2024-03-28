package Jobsheet4.minggu5;

public class pangkat03 {
    public int nilai,pangkat;

    public pangkat03(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF(int a, int n){
        int hasil = 1;
        for(int i = 0; i < n; i++){
            hasil = hasil * a;
        }
        return hasil;
    }
    public int pangkatDC(int a, int n){
        if(n == 0){
            return 1;
        }else{
            if(n%2 == 1){
                return (pangkatDC(a,n/2) * pangkatDC(a,n/2) * a);
            }else{
                return (pangkatDC(a,n/2) * pangkatDC(a,n/2));
            }
        }
    }
}