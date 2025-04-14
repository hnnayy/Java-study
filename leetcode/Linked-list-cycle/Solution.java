// Definisi untuk node dari singly-linked list
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Membuat linked list: 3 -> 2 -> 0 -> -4 (dengan siklus di -4 kembali ke 2)
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Membuat siklus (node4 ke node2)

        Solution sol = new Solution();
        boolean result = sol.hasCycle(head);
        
        if(result) {
            System.out.println("true");  // Ada siklus
        } else {
            System.out.println("false");  // Tidak ada siklus
        }
    }

    // Memeriksa apakah linked list memiliki siklus
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;           // Langkah lambat (1 langkah)
            fast = fast.next.next;      // Langkah cepat (2 langkah)

            // Jika slow dan fast bertemu, berarti ada siklus
            if(slow == fast) {
                return true;
            }
        }

        // Tidak ada siklus
        return false;
    }
}
