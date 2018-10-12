class Solution {
    String []hour = new String[] {"1", "2", "4", "8"};
    String []min = new String[] {"1", "2", "4", "8", "16", "32"};
    public HashSet<String> readBinaryWatchHelper(int num, HashSet<String> time, int mindex, int hindex, int h, int m){
        if(num == 0){
            StringBuilder str;
            if(h >= 12)
                return time;
            if(m >= 60){
                return time;
            }
            if(m < 10)
                str = new StringBuilder(h + ":0" + m);
            else
                str = new StringBuilder(h + ":" + m);
            if(str.toString().equals("12:00"))
                System.out.println(h + " "+ m);
            time.add(str.toString());
            return time;
        }
        for(int j = mindex + 1; j < min.length; j++){
                readBinaryWatchHelper(num - 1, time, j, hindex, h, m + Integer.parseInt(min[j]));
        }
        for(int j = hindex + 1; j < hour.length; j++){
                readBinaryWatchHelper(num - 1, time, mindex, j, h + Integer.parseInt(hour[j]), m);
        }
        return time;
    }
    
    public List<String> readBinaryWatch(int num) {
        if(num <= 0){
            List<String> time = new ArrayList<String>();
            time.add(new StringBuilder("0:00").toString());
            return time;
        }
        HashSet <String> time = new HashSet<String>();
        StringBuilder str = new StringBuilder();
        return new ArrayList<String>(readBinaryWatchHelper(num, time, -1, -1, 0, 0));
    }
    
}