package RangeSumofBST938;

import java.util.Stack;

/**
 * @ClassName Solution02
 * @Description https://leetcode-cn.com/problems/range-sum-of-bst/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 10:11
 * @Version 1.0
 */
public class Solution02 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp != null){
                if (L <= temp.val && temp.val <= R) {
                    result = result + temp.val;
                }
                if (temp.val > L) {
                    stack.push(temp.left);
                }
                if (temp.val < R) {
                    stack.push(temp.right);
                }
            }
        }
        return result;
    }
}
