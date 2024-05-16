package Jobsheet12.Tugas;

public class Film03 {
    String id;
    String judul;
    double rating;
    Film03 next;
    Film03 prev;

    public Film03(String id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
