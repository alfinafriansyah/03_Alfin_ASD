package Jobsheet9;

public class SLLMain03 {
    public static void main(String[] args) {
        LinkedList03 myLinkedList03 = new LinkedList03();
        // myLinkedList03.print();
        // myLinkedList03.addFirst(800);
        // myLinkedList03.print();
        // myLinkedList03.addFirst(700);
        // myLinkedList03.print();
        // myLinkedList03.addLast(500);
        // myLinkedList03.print();
        // myLinkedList03.insertAfter(700, 300);
        // myLinkedList03.print();
        // System.out.println("Data pada index ke-1: " + myLinkedList03.getData(1, 10));
        // System.out.println("Data 300 berada pada index ke: " + myLinkedList03.indexxOf(300));
        // myLinkedList03.remove(300);
        // myLinkedList03.print();
        // myLinkedList03.removeFirst();
        // myLinkedList03.print();
        // myLinkedList03.removeLast();
        // myLinkedList03.print();

        myLinkedList03.addLast(100);
        myLinkedList03.addLast(200);
        myLinkedList03.addLast(300);
        myLinkedList03.addLast(400);
        myLinkedList03.addLast(500);
        System.out.println("Linked list awal:");
        myLinkedList03.removeFirst();
        myLinkedList03.print();
        myLinkedList03.insertBefore(300, 250);
        System.out.println("Linked list setelah insertBefore 300 dengan 250:");
        myLinkedList03.print();
        myLinkedList03.insertAt(2, 150);
        System.out.println("Linked list setelah insertAt index 2 dengan 150:");
        myLinkedList03.print();
        myLinkedList03.removeAt(3);
        System.out.println("Linked list setelah removeAt index 3:");
        myLinkedList03.print();
    }
}