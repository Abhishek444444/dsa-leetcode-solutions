/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDiameter = 0; // to store the global maximum diameter

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    // Helper function to compute height
    private int height(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Diameter through this node = leftHeight + rightHeight
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return height of this node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
/*
Complexity
Time: O(N) — each node visited once.
Space: O(H) — recursion stack, where H = height of tree. 
*/