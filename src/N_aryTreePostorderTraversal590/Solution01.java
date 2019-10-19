package N_aryTreePostorderTraversal590;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution01
 * @Description https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 * @Author tangchao@mfexcel.com
 * @Date 2019/10/18 16:42
 * @Version 1.0
 */
public class Solution01 {

    List<Integer> list = new ArrayList<>();

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        if (root == null)
            return list;
        List<Node> nodes = root.children;
        if (nodes.size() > 0 ) {
            nodes.stream().forEach(e -> {
                postorder(e);
            });
        }
        list.add(root.val);
        return list;
    }
}
