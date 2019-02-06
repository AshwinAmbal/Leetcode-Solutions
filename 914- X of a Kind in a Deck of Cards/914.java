class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap <Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int i = 0; i < deck.length; i++)
            count.put(deck[i], count.getOrDefault(deck[i], 0) + 1);
        int X = 0, flag = 0;
        boolean even = false;
        for(Map.Entry entry : count.entrySet()){
            if(flag == 0){
                X = (int) entry.getValue();
                flag = 1;
            }
            else{
                X = LCM((int) entry.getValue(), X);                
            }
        }
        return X >= 2;
    }
    
    int LCM(int A, int B){
        for(int i = Math.min(A,B); i >= 1; i--)
            if(A % i == 0 && B % i == 0)
                return i;
        return 1;
    }
}