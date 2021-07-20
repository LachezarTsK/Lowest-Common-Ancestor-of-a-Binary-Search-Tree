public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int min = p.val <= q.val ? p.val : q.val;
        int max = p.val > q.val ? p.val : q.val;

        TreeNode lowestCommonRoot = null;
        TreeNode current = root;

        while (current != null) {

            if (current.val > max) {
                current = current.left;
            } else if (current.val < min) {
                current = current.right;
            } else {
                lowestCommonRoot = current;
                break;
            }

        }
        return lowestCommonRoot;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
