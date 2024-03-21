package Jobsheet6;

import java.util.List;

public class DaftarMahasiswaBerprestasi03 {
    Mahasiswa03 listMhs[] =  new Mahasiswa03[5];
    int idx;

    void tambah(Mahasiswa03 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa03 m : listMhs){
            m.tampil();
            System.out.println("---------------------");
        }
    }

    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j = 1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa03 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-i];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
