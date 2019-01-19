class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap <String, Integer> cp = new HashMap<String, Integer>();
        for(String s : cpdomains){
            String str = "";
            Integer num = Integer.parseInt(s.split(" ")[0]);
            String [] domain = s.split(" ")[1].split("\\.");
            for(int i = domain.length - 1; i >= 0; i--){
                str = domain[i] + str;
                cp.put(str, cp.getOrDefault(str, 0) + num);
                str = "." + str;
            }
        }
        String result[] = new String[cp.size()];
        int i = 0;
        for(Map.Entry entry : cp.entrySet()){
            String res = entry.getValue() + " " + (String) entry.getKey();
            result[i++] = res;
        }
        return Arrays.asList(result);
    }
}