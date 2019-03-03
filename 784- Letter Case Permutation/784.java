class Solution {
    public List<String> letterCasePermutation(String S) {
        int count = 0;
        List <String> arr = new ArrayList<String>();
        StringBuilder str = new StringBuilder();
        return createPermutations(arr, str, 0, S);
    }
    
    List<String> createPermutations(List<String> arr, StringBuilder str, int index, String S){
        while(index < S.length() && Character.isDigit(S.charAt(index))){
            str.append(S.charAt(index++));
        }
        if(index == S.length()){
            arr.add(str.toString());
            return arr;
        }
        if(index < S.length() && Character.isLetter(S.charAt(index))){
            StringBuilder upper = new StringBuilder(str);
            str.append(Character.toLowerCase(S.charAt(index)));
            arr = createPermutations(arr, str, index + 1, S);
            upper.append(Character.toUpperCase(S.charAt(index)));
            arr = createPermutations(arr, upper, index + 1, S);
        }
        return arr;
    }
}