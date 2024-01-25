/****************************************************************
 * 
 * Following is the hecklass structure of the Node class:
 *****************************************************************/

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
    public static int lengthOfLoop(Node head) {
        int res = 0;
        if (head == null || head.next == null) {
            return 0;
        }
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = fast.next;
                res++;
                while (fast != slow) {
                    fast = fast.next;
                    res++;
                }
                return res;
            }
        }
        return res;
    }
}
