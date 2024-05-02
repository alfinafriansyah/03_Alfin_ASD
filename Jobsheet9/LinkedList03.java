package Jobsheet9;

import org.w3c.dom.Node;

public class LinkedList03 {
    Node03 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node03 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        Node03 newNode = new Node03(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node03 newNode = new Node03(input,null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node03 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node03 newNode = new Node03(input, null);

        if (!isEmpty()) {
            Node03 currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }

    public int getData(int index, int size) {
         // Cek apakah linked list kosong
        if (head == null) {
            throw new IllegalStateException("Linked list kosong");
        }

        // Cek apakah indeks valid
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indeks di luar batas linked list");
        }

        Node03 currentNode = head;
        int currentIndex = 0;

        // Iterasi hingga node dengan indeks yang diminta ditemukan
        while (currentIndex != index) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        return currentNode.data;

    }
    
    public int indexxOf(int key) {
        Node03 currentNode = head;
        int index = 0;
    
        while(currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }
    
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }
    
    public void removeFirst() {
        if(!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        }else if (head.next == null) {
            head = null;
        } else {
            Node03 currentNode = head;
    
            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    
    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node03 currentNode = head;
    
            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void insertBefore(int key, int input) {
        Node03 newNode = new Node03(input, null);
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            addFirst(input);
        } else {
            Node03 currentNode = head;
            while (currentNode.next != null && currentNode.next.data != key) {
                currentNode = currentNode.next;
            }
            if (currentNode.next == null) {
                System.out.println("Key tidak ditemukan");
            } else {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
    }

    public void insertAt(int index, int input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node03 newNode = new Node03(input, null);
            Node03 currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                if (currentNode == null) {
                    System.out.println("Index melebihi batas");
                    return;
                }
                currentNode = currentNode.next;
            }
            if (currentNode == null) {
                System.out.println("Index melebihi batas");
            } else {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node03 currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                if (currentNode.next == null) {
                    System.out.println("Index melebihi batas");
                    return;
                }
                currentNode = currentNode.next;
            }
            if (currentNode.next == null) {
                System.out.println("Index melebihi batas");
            } else {
                currentNode.next = currentNode.next.next;
            }
        }
    }
}
