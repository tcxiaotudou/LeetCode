package RangeSumofBST938;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/range-sum-of-bst/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 9:43
 * @Version 1.0
 */
public class Solution01 {
    int result;

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        result = 0;
        dfs(root, L, R);
        return result;
    }

    public void dfs(TreeNode root, int L, int R) {
        if (root != null) {
            if (root.val >= L && root.val <= R) {
                result = result + root.val;
            }
            if (root.val < R) {
                dfs(root.right, L, R);
            }
            if (root.val > L) {
                dfs(root.left, L, R);
            }
        }
    }
//            10
//        5        15
//     3    7  null    18
}
