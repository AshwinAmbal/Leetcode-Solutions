class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] nextGreat = new int[nums1.length];
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        Stack <Integer> stack = new Stack<>();
        int flag;
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for(int i = 0; i< nums1.length; i++)
            nextGreat[i] = map.getOrDefault(nums1[i], -1);
        return nextGreat;
    }
}