import java.util.HashSet;

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
}

public class Solution {
    public static Node firstNode(Node head) {
        Node fast = head, slow = head, check = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                while (check != slow) {
                    check = check.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}

// public class Solution {
// public static Node firstNode(Node head) {
// HashSet<Node> st = new HashSet<>();
// Node temp = head;
// while (temp != null) {
// if (st.contains(temp)) {
// return temp;
// }
// st.add(temp);
// temp = temp.next;
// }
// return null;
// }
// }