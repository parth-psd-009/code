class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
};

public class Solution {
    public static Node deleteMiddle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node fast = head, slow = head;
        Node target = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (target == null) {
                target = head;
            } else {
                target = target.next;
            }
        }
        target.next = target.next.next;
        return head;
    }
}