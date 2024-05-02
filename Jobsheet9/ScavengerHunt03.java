package Jobsheet9;

public class ScavengerHunt03 {
    Pointer03 head;

    public ScavengerHunt03() {
        this.head = null;
    }

    public void addPoint(String question, String answer) {
        Pointer03 newPoint = new Pointer03(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            Pointer03 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    public void displayPoints() {
        Pointer03 current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Point " + index + ": " + current.pertanyaan);
            current = current.next;
            index++;
        }
    }

    public boolean checkAnswer(String userAnswer) {
        if (head != null) {
            if (head.jawaban.equalsIgnoreCase(userAnswer)) {
                head = head.next;
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
