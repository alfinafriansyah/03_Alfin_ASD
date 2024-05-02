package Jobsheet9;

public class Pointer03 {
    String pertanyaan;
    String jawaban;
    Pointer03 next;

    public Pointer03(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.next = null;
    }
}
