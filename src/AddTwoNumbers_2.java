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
            boolean leftFlag = true;
            boolean rightFlag = true;
            boolean carry = false;
            ListNode result = new ListNode(0);
            ListNode cur = result;
            int sum = 0;
            while (leftFlag || rightFlag || carry) {
                if (leftFlag) {
                    sum += l1.val;
                    if (l1.next != null) {
                        l1 = l1.next;
                    } else {
                        leftFlag = false;
                    }
                }
                if (rightFlag) {
                    sum += l2.val;
                    if (l2.next != null) {
                        l2 = l2.next;
                    } else {
                        rightFlag = false;
                    }
                }
                if (carry) {
                    sum += 1;
                }
                if (sum >= 10) {
                    carry = true;
                    sum = sum - 10;
                } else {
                    carry = false;
                }
                cur.next = new ListNode(sum);
                cur = cur.next;
                sum = 0;
            }
            return result.next;
        }
    }
}
