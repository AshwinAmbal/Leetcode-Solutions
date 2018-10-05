class Solution {
    public boolean isHappy(int n) {
        int sum = 0, main = n, rem;
        Set <Integer> hash = new HashSet<Integer>();
        while(sum != 1){
            sum = rem = 0;
            while(main != 0){
                rem = main % 10;
                sum += Math.pow(rem, 2);
                main/= 10;
            }
            if(hash.contains(sum) == false)
                hash.add(sum);
            else 
                break;
            main = sum;
        }
        if(sum == 1)
            return true;
        else
            return false;
    }
}