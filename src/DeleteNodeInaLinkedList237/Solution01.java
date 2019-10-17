package DeleteNodeInaLinkedList237;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/17 16:40
 * @Version 1.0
 */
public class Solution01 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
