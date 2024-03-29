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
    public int diameterOfBinaryTree(TreeNode root) {
        
        int[] ans = new int[1];
        maxDepth(root, ans);
        return ans[0];
    }

    int maxDepth(TreeNode root, int[] arr) {

        if(root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left, arr);
        int rightHeight = maxDepth(root.right, arr);
        arr[0] = Math.max(arr[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
  
    }
}