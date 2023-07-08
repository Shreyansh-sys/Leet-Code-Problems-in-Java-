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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> allPath = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        findPath(root, targetSum, currentPath, allPath);
        return allPath;
    }

    private static void findPath(TreeNode currentNode, int targetSum, List<Integer> currentPath, List<List<Integer>> allPath){
        if(currentNode == null) return;
        currentPath.add(currentNode.val);
        if(currentNode.val == targetSum && currentNode.left == null && currentNode.right == null){
        allPath.add(new ArrayList<Integer>(currentPath));
        }

        findPath(currentNode.left, targetSum - currentNode.val, currentPath, allPath);
        findPath(currentNode.right, targetSum - currentNode.val, currentPath, allPath);

        currentPath.remove(currentPath.size() - 1);
    }
}