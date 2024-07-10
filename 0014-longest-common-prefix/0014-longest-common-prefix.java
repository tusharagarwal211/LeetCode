class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int arrLength = strs.length;
        int firstString = strs[0].length();
        int lastString = strs[arrLength - 1].length();
        int len = 0;
        String ans = "";
        
        if(firstString < lastString) {
            len = firstString;
        }
        else {
            len = lastString;
        }
        
        for(int i = 0; i < len; i ++) {
            if(strs[0].charAt(i) == strs[arrLength - 1].charAt(i)) {
                ans = ans + strs[0].charAt(i);
            }
            else {
                break;
            }
        }
        
        return ans;
    }
}