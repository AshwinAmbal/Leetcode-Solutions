class KthLargest {
    PriorityQueue<Integer> minHeap;
    int size;
    public KthLargest(int k, int[] nums) {
        size = k;
        minHeap =  new PriorityQueue<Integer>(k);
        for(int i = 0; i < nums.length; i++){
            if(minHeap.size() == size){
                if(minHeap.peek() < nums[i]){
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
            else{
                minHeap.add(nums[i]);                
            }
        }
    }
    
    public int add(int val) {
        if(minHeap.size() == size){
                if(minHeap.peek() < val){
                    minHeap.poll();
                    minHeap.add(val);
                }
            }
            else{
                minHeap.add(val);                
            }
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */