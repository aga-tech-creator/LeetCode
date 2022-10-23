public class OddEvenLinkedList {
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
        public ListNode oddEvenList(ListNode head) {
            if (head == null)
                return null;

            ListNode startNodeHalf = head.next;
            ListNode odd = head;
            ListNode even = head.next;
            ListNode endOfOdds = odd;
            int high = 0;

            while (even != null) {
                endOfOdds = odd;
                high++;

                odd.next = even.next;
                odd = even;
                even = even.next;
            }

            if (high % 2 == 0)
                odd.next = startNodeHalf;
            else
                endOfOdds.next = startNodeHalf;

            return head;
        }
    }
}