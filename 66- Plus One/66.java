class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0) return new int[]{1};
        int i = digits.length-1;
        while(i>=0 && digits[i] + 1 > 9){
                digits[i] = 0;
                i--;
            }
        if(i < 0){
            int[] dig = new int[digits.length + 1];
            dig[0] = 1;
            System.arraycopy(digits, 0, dig, 1, digits.length);
            return dig;
        }    
        else{
            digits[i]+=1;
        }
        return digits;
    }     
}