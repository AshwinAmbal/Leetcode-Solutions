class Solution {
    public int findComplement(int num) {
        int invert = 0, count = 0, temp = num;
        while(temp != 0){
            temp >>= 1;
            count++;
        }
        for(int i = 0; i < count; i++){
            if((num & (1 << i)) > 0){
                invert = ~(1 << i);
                num = num & invert;
            }
            else{
                num = num | (1 << i);
            }
        }
        return num;
    }
}