class Solution {
    public int compress(char[] chars) {
        int cur = 0, count = 0, nextIndex = 0;
        if(chars.length == 1)
            return 1;
        while(cur < chars.length){
            int i = 1;
            while(cur + i < chars.length && chars[cur] == chars[cur + i]){
                count++;
                i++;
            }
            if(count == 0){
                chars[nextIndex] = chars[cur];
                cur++;
                nextIndex++;
                continue;
            }
            StringBuilder str = new StringBuilder(Integer.toString(count + 1));
            chars[nextIndex] = chars[cur];
            for(int j = 0; j < str.length(); j++)
                chars[++nextIndex] = str.charAt(j);
            nextIndex++;
            cur += count + 1;
            count = 0;
        }
        return nextIndex;
    }
}