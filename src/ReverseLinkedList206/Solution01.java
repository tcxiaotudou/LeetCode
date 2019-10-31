package ReverseLinkedList206;

import java.util.Stack;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/reverse-linked-list/
 * @date 2019/10/31
 */
public class Solution01 {
        public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public ListNode reverseList(ListNode head) {
            if (head == null) {
                return null;
            }
        ListNode newHead = new ListNode(0);
        ListNode temp = new ListNode(0);
        Stack<ListNode> stack = new Stack<>();
        while (head.next != null) {
            stack.push(head);
            head = head.next;
        }
        stack.push(head);
        newHead = stack.pop();
        temp = newHead;
        while (!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop().val);
            temp.next = node;
            temp = temp.next;
        }
        return newHead;
    }
}
