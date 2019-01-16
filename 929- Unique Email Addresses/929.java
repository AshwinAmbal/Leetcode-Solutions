class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet <String> set = new HashSet<String>();
        for(int i = 0; i < emails.length; i++){
            StringBuilder str = new StringBuilder();
            int flag = 0;
            for(int j = 0; j < emails[i].length(); j++){
                if(emails[i].charAt(j) == '@'){
                    str.append(emails[i].substring(j));
                    break;
                }
                if(emails[i].charAt(j) == '.' || flag == 1)
                    continue;
                if(emails[i].charAt(j) == '+'){
                    flag = 1;
                    continue;
                }
                str.append(emails[i].charAt(j));
            }
            set.add(str.toString());
        }
        return set.size();
    }
}