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
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int maxSum = Integer.MIN_VALUE;
        int level = 0;
        int maxLevel = 0;
        
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int currentLevelSum = 0;

            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevelSum += currentNode.val;

                if(currentNode.left != null)
                queue.offer(currentNode.left);
                if(currentNode.right != null)
                queue.offer(currentNode.right);
            }

            level++;

            if(maxSum < currentLevelSum){
                maxSum = currentLevelSum;
                maxLevel = level;
            }

        }
        return maxLevel;

    }
}