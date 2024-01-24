// /*
//  * @lc app=leetcode id=141 lang=java
//  *
//  * [141] Linked List Cycle
//  */

// // @lc code=start

// import java.util.HashMap;
// import java.util.Map;

// /**
//  * Definition for singly-linked list.
//  * class ListNode {
//  * int val;
//  * ListNode next;
//  * ListNode(int x) {
//  * val = x;
//  * next = null;
//  * }
//  * }
//  */
// class ListNode {
//     ListNode next;
//     ListNode data;
// }

// class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode temp = head;
//         if (temp == null || temp.next == null) {
//             return false;
//         }
//         Map<ListNode, Integer> mpp = new HashMap<>();
//         while (temp != null) {
//             if (mpp.containsKey(temp)) {
//                 return true;
//             } else {
//                 mpp.put(temp, 1);
//                 temp = temp.next;
//             }
//         }
//         return false;
//     }
// }
// // @lc code=end

/* **********************************************************************  */
/**/
/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

class ListNode {
    ListNode next;
    ListNode data;
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
// @lc code=end
