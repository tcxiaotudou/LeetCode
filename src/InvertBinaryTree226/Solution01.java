package InvertBinaryTree226;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/invert-binary-tree/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 14:31
 * @Version 1.0
 */
public class Solution01 {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
