package Easy;

public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode first = head;
            ListNode second = nodeOfhalfList(head);
            second = reverseList(second.next);

            ListNode trace1 = first;
            ListNode trace2 = second;

            while (trace1 != null && trace2 != null) {
                if (trace1.val != trace2.val)
                    return false;
                trace1 = trace1.next;
                trace2 = trace2.next;
            }

            reverseList(first);

            return true;
        }

        public ListNode nodeOfhalfList(ListNode slow) {
            ListNode fast = slow;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        public ListNode reverseList(ListNode actual) {
            ListNode prev = null;

            while (actual != null) {
                ListNode after = actual.next;

                actual.next = prev;

                prev = actual;
                actual = after;
            }

            return prev;
        }
    }
}
