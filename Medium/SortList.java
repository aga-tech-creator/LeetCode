import java.util.PriorityQueue;

public class SortList {
    class ListNode {
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
        public ListNode sortList(ListNode head) {
            ListNode actual = head;
            PriorityQueue<Integer> heap = new PriorityQueue<>();

            while (actual != null) {
                heap.add(actual.val);
                actual = actual.next;
            }

            actual = head;

            while (actual != null) {
                actual.val = heap.poll();
                actual = actual.next;
            }

            return head;
        }
    }

}