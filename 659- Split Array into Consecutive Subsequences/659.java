class Solution {
    public boolean isPossible(int[] nums) {
        int [] temp = new int[nums.length];
        int count = 0, temporary=-1, flag=0;
        int counts[] = new int[nums.length];
        temp[0] = nums[0];
        counts[0] = 1;
        for(int i = 1;i<nums.length; i++){
            if(count == 0){
                if(nums[i] - temp[count] == 1){
                    temp[count] = nums[i];
                    counts[count] += 1;
                }
                else
                {   
                    count++;
                    temp[count] = nums[i];
                    counts[count] += 1;
                }
            }
            else{
                temporary = -1;
                flag = 0;
                for(int j = 0;j<count+1;j++){
                    if(nums[i]-temp[j]==1){
                        if(counts[j]<3){
                        temp[j] = nums[i];
                        counts[j] += 1;
                        flag=1;
                        break;
                        }
                        else
                            temporary = j;
                    }
                }
                if(flag == 0){
                    if(temporary!= -1){
                        temp[temporary] = nums[i];
                        counts[temporary]+=1;
                    }
                    else{
                        ++count;
                        temp[count] = nums[i];
                        counts[count] += 1;
                    }
                }
            }
        /*    for(int k =0; k<count+1;k++)
                System.out.print(temp[k] + ",");
            System.out.println();
            for(int k =0; k<count+1;k++)
                System.out.print(counts[k] + ",");
            System.out.println();*/
        }
        for(int j=0;j<count+1;j++){
            if(counts[j]<3)
                return false;
        }
        return true;
    }
    
}