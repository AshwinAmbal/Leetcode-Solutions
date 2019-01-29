class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean oneBit = false;
        for(int i = 0; i < bits.length; i++){
            if(bits[i] == 1){
                oneBit = false;
                i++;
            }
            else
                oneBit = true;
        }
        return oneBit;
    }
}