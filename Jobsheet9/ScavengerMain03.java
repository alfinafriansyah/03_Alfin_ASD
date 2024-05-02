package Jobsheet9;

import java.util.Scanner;

public class ScavengerMain03 {
    public static void main(String[] args) {
        ScavengerHunt03 game = new ScavengerHunt03();
        game.addPoint("Apa ibukota Jawa Timur?", "Surabaya");
        game.addPoint("Apa ibukota Jawa Tengah?", "Semarang");
        game.addPoint("Apa ibukota Jawa Barat?", "Bandung");
        game.addPoint("Apa ibukota Bali?", "Denpasar");

        game.displayPoints();

        Scanner sc = new Scanner(System.in);
        while (game.head != null) {
            System.out.print("Jawab: ");
            String answer = sc.nextLine();
            if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc.close();
        System.exit(0);
    }
}
