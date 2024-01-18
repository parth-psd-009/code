/**
 * LinkedList
 */
public class LinkedListIntro {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(4);
        list.insertAtHead(5);
        System.out.println(list.size);
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    LinkedList() {
        this.size = 0;
    }

    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtTail(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            insertAtHead(value);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void displayList() {
        Node temp = head;
        System.out.println("Head->");
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertAtHead(value);
            return;
        }
        if (index == size) {
            insertAtTail(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
    }

    public int deleteFromHead() {
        if (head == null) {
            return -1;
        }
        int temp = head.value;
        head = head.next;
        return temp;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
