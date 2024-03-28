package Jobsheet6;

public class HotelService03 {
    Hotel03 rooms[] =  new Hotel03[5];
    int idx;

    void tambah(Hotel03 h){
        if(idx < rooms.length){
            rooms[idx] = h;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Hotel03 h : rooms){
            System.out.println("Nama: " + h.nama);
            System.out.println("Kota: " + h.kota);
            System.out.println("Harga: " + h.harga);
            System.out.println("Bintang: " + h.bintang);
            System.out.println("----------------------------------");
        }
    }

    void hargaBubbleSort(){
        for(int i = 0; i < rooms.length-1; i++){
            for(int j = 1; j < rooms.length-i; j++){
                if(rooms[j].harga < rooms[j-1].harga){
                    Hotel03 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void hargaSelectionSort(){
        for(int i = 0; i < rooms.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j < rooms.length; j++){
                if(rooms[j].harga < rooms[idxMin].harga){
                    idxMin = j;
                }
            }
            Hotel03 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }

    void bintangBubbleSort(){
        for(int i = 0; i < rooms.length-1; i++){
            for(int j = 1; j < rooms.length-i; j++){
                if(rooms[j].bintang > rooms[j-1].bintang){
                    Hotel03 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void bintangSelectionSort(){
        for(int i = 0; i < rooms.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j < rooms.length; j++){
                if(rooms[j].bintang > rooms[idxMin].bintang){
                    idxMin = j;
                }
            }
            Hotel03 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
