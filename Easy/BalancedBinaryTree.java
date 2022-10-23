package Easy;

import java.lang.Math;

public class BalancedBinaryTree {
    class TreeNode {
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
        public boolean isBalanced(TreeNode root) {
            if (isBalanced(root, 0) == -1)
                return false;
            else
                return true;
        }

        private int isBalanced(TreeNode node, int h) {
            if (node == null)
                return h;

            int hSubTree1 = isBalanced(node.right, h + 1);
            int hSubTree2 = isBalanced(node.left, h + 1);

            if (!(Math.abs(hSubTree1 - hSubTree2) <= 1))
                return -1;

            if (hSubTree1 > hSubTree2)
                return hSubTree1;
            else
                return hSubTree2;
        }
    }
}
