import java.util.HashMap;
import java.util.Map;

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
    public static boolean detectCycle(Node head) {
        Node temp = head;
        if (temp == null || temp.next == null) {
            return false;
        }
        Map<Node, Integer> mpp = new HashMap<>();
        while (temp != null) {
            if (mpp.get(temp) == 1) {
                return true;
            } else {
                mpp.put(temp, 1);
                temp = temp.next;
            }
        }
        return false;
    }
}
