class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1)
            return false;
        int sum = 1, min = num;
        for(int i = 2 ; i < min ; i++){
            if(num % i == 0){
                    sum += i + (num/i);
            }
            min = Math.min(min, num/i);
            if(sum > num)
                return false;
        }
        if(sum == num)
            return true;
        else
            return false;
    }
}