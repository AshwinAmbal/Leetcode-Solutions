class RecentCounter {
    int currCount;
    ArrayList <Integer> timeStep;
    public RecentCounter() {
        currCount = 0;
        timeStep = new ArrayList<Integer>();
    }
    
    public int ping(int t) {
        timeStep.add(t);
        currCount++;
        int smallest = timeStep.get(0);
        while(t - smallest > 3000){
            timeStep.remove(0);
            currCount--;
            smallest = timeStep.get(0);
        }
        return currCount;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */