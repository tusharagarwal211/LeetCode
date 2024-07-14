class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        
        if(sLength != tLength) {
            return false;
        }
        
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        String sSorted = new String(sArr);
        
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        String tSorted = new String(tArr);
        
        boolean ans = sSorted.equals(tSorted);
        
        return ans;
    }
}