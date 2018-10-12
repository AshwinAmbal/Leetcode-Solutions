class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        Integer sum = 0, carry = 0;
        if(num1.length() > num2.length()) {
            for(int i = 0; i < Math.abs(num1.length() - num2.length()); i++)
                str.append('0');
            str.append(num2);
        }
        else{
            for(int i = 0; i < Math.abs(num1.length() - num2.length()); i++)
                str.append('0');
            str.append(num1);
            num1 = num2;
        }
        StringBuilder final_sum = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            sum = (str.charAt(i)  + num1.charAt(i) - 96 + carry) % 10;
            carry = (str.charAt(i)  + num1.charAt(i) - 96 + carry) / 10;
            final_sum.append(sum);
            
        }
        if(carry == 1)
            final_sum.append(carry);
        return final_sum.reverse().toString();
    }
}