class TimeMap {

    HashMap<String, List<Pair<String, Integer>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair<String, I/**
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
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode root, long min, long max){
        if(root == null) return true;

        if(root.val <= min || root.val >= max) return false;

        return(dfs(root.left, min, root.val) && dfs(root.right, root.val, max));
    }
}nteger>> list = map.get(key);
        return search(list, timestamp);
    }

    public String search(List<Pair<String, Integer>> list, int timestamp){
        int left = 0, right = list.size() - 1;
        while(left < right){
            int mid = left + (right - left + 1)/2;
            if(list.get(mid).getValue() <= timestamp){
                left = mid;
            }
            else right = mid - 1;
        }

        return list.get(left).getValue() <= timestamp ? list.get(left).getKey() : "";
    }

    
}
