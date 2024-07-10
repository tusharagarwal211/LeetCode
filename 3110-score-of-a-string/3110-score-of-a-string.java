class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int diff = 0;
        
        for(int i = 0; i < s.length() - 1; i++){
            diff = Math.abs(s.charAt(i + 1) -  s.charAt(i));
            score = score + diff;
        }
        
        return score;
    }
}