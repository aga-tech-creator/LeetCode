package Easy;

public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return isSymmetric(root.right, root.left);
        }

        private boolean isSymmetric(TreeNode node1, TreeNode node2) {
            if (node1 == null && node2 == null)
                return true;
            else if (node1 == null || node2 == null)
                return false;

            if ((node1.val == node2.val)
                    && (isSymmetric(node1.right, node2.left) && isSymmetric(node1.left, node2.right)))
                return true;
            else
                return false;
        }
    }
}
