class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i, loc = -1;
        HashMap<Integer, Integer> hash = new HashMap <Integer, Integer>();
        for(i = 0; i < numbers.length; i++){
            if(hash.get(target - numbers[i]) != null){
                loc = hash.get(target - numbers[i]);
                break;
            }
            hash.put(numbers[i], i);
        }
        
        return new int[] {loc + 1, i + 1};    
    }
}