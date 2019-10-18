package MaximumDepthofBinaryTree104;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 15:32
 * @Version 1.0
 */
public class Solution01 {

    int result = 0;

    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return java.lang.Math.max(left, right) + 1;
    }
}
