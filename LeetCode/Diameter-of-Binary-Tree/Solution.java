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
    public int getHt(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = getHt(root.left);
        int rh = getHt(root.right);
        return 1+Math.max(lh,rh);
    }
    public int getWd(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = getHt(root.left);
        int rh = getHt(root.right);
        int lw = getWd(root.left);
        int rw = getWd(root.right);

        return Math.max(lh+rh,Math.max(lw,rw));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return getWd(root);   
    }
}