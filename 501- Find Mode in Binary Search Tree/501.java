/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxCount = 1, currVal, currCount = 0;
    List<Integer> arr ;
    
    public int[] findMode(TreeNode root) {
        if(root == null)
            return new int[0];
        currCount = 0;
        currVal = root.val;
        arr = new ArrayList<Integer>();
        traverseCount(root);
        currCount = 0;
        currVal = root.val;
        traverseGet(root);
        int[] res = new int[arr.size()];
        for(int i = 0; i< arr.size(); i++)
            res[i] = arr.get(i);
        return res;
    }
    
    void traverseCount(TreeNode root){
        if(root == null)
            return;
        traverseCount(root.left);
        if(root.val == currVal)
            currCount += 1;
        else{
            currCount = 1;
            currVal = root.val;
        }
        maxCount = Math.max(maxCount, currCount);
        traverseCount(root.right);
    }
    
    void traverseGet(TreeNode root){
        if(root == null)
            return;
        traverseGet(root.left);
        if(root.val == currVal)
            currCount += 1;
        else{
            currCount = 1;
            currVal = root.val;
        }
        if(maxCount == currCount)
            arr.add(root.val);
        traverseGet(root.right);
    }
}