class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        
        if(sLength != tLength) {
            return false;
        }
        
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        
        boolean ans = Arrays.equals(sArr, tArr);
        
        return ans;
    }
}