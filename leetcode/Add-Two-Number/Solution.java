public class Solution {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(); // Dummy node to simplify code
        ListNode res = dummy;            // Result pointer
        int total = 0, carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;

            dummy.next = new ListNode(num); // Create new node and link it
            dummy = dummy.next;             // Move to the new node
        }

        return res.next;  // Return the next node of the dummy, which is the result list's head
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test the solution with example input
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // Represents [2, 4, 3]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // Represents [5, 6, 4]

        ListNode result = solution.addTwoNumbers(l1, l2);

        // Output the result linked list
        while (result != null) {
            System.out.print(result.val + " ");  // Print each value followed by a space
            result = result.next;               // Move to the next node
        }
    }
}
