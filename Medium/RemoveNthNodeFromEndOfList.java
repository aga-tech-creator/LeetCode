public class RemoveNthNodeFromEndOfList {
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int flag = removeNthFromEnd(head, head, n);

            if (flag == -1)
                return null;
            else if (flag == -2)
                return head.next;
            else
                return head;
        }

        public int removeNthFromEnd(ListNode actual, ListNode after, int n) {
            if (after == null)
                return 1;

            int high = removeNthFromEnd(after, after.next, n);

            if (n == high) {

                if (actual == after) {

                    if (high == 1)
                        return -1;
                    else
                        return -2;

                }

                actual.next = after.next;
            }

            return ++high;
        }
    }
}
