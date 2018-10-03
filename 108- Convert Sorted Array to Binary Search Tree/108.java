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
    TreeNode arraytobst(int[] nums, int first, int last){
        if(first>last) return null;
        int mid = (first + last)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = arraytobst(nums, first, mid-1);
        root.right = arraytobst(nums, mid+1, last);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return arraytobst(nums, 0, nums.length-1);        
    }
}