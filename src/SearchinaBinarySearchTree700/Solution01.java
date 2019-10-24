package SearchinaBinarySearchTree700;

/**
 * @author fciasth
 * @desc https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 * @date 2019/10/24
 */
public class Solution01 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        while (root != null) {
            if (val < root.val) {
                root = root.left;
            } else if (val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}
