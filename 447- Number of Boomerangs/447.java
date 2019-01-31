class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        for(int[] p: points){
            HashMap<Integer, Integer> maps = new HashMap<>();
            for(int[] pair: points){
                int dist = (p[0] - pair[0]) * (p[0] - pair[0]) + (p[1] - pair[1]) * (p[1] - pair[1]);
                int t = maps.getOrDefault(dist, 0);
                count = count + 2*t;
                maps.put(dist, t + 1);
            }
        }
        return count;
    }
}