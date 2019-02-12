class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int carry = 0, i = A.length - 1, sum = 0;
        ArrayList <Integer> result = new ArrayList<Integer>();
        while(K != 0){
            int rem = K % 10;
            sum = i >= 0 ? rem + A[i--] + carry : rem + carry;
            result.add(0, sum % 10);
            carry = sum > 9 ? 1 : 0;
            K /= 10;
        }
        while(carry == 1 || i >= 0){
            if(i >= 0){
                sum = carry + A[i--];
                result.add(0, sum % 10);
                carry = sum > 9 ? 1 : 0;
            }
            else{
                result.add(0, carry);
                carry = 0;
            }
            
        }
        return result;
    }
}