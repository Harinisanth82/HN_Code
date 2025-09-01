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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
       int level = 0;
       Deque<TreeNode> q = new ArrayDeque<>();
       q.offer(root);
       while(!q.isEmpty()){
            for(int count = q.size(); count != 0; count--){
                TreeNode curr = q.poll();
                if(curr.left == null && curr.right == null){
                    return level+1;
                }
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            ++level;
       }
       return 0;
    }
}