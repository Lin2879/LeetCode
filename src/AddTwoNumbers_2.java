public class AddTwoNumbers_2 {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum = 0;
            ListNode result = new ListNode(0);
            ListNode cur = result;
            while (l1 != null || l2 != null || sum != 0) {
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }
                cur.next = new ListNode(sum % 10);
                cur = cur.next;
                sum = sum / 10;
            }
            return result.next;
        }
    }
}
