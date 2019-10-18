package MergeTwoBinaryTrees617;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/merge-two-binary-trees/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 11:05
 * @Version 1.0
 */
public class Solution01 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode result = new TreeNode(t1.val + t2.val);
        result.left = mergeTrees(t1.left, t2.left);
        result.right = mergeTrees(t1.right, t2.right);
        return result;
    }
}
