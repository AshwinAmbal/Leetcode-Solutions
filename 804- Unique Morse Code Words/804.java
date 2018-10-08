class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet <String> unique_morse = new HashSet<String>();
        String[] morse_code = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0; i < words.length; i++){
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++){
                temp.append(morse_code[words[i].charAt(j) - 97]);
            }
            unique_morse.add(temp.toString());
        }
        return unique_morse.size();
    }
}