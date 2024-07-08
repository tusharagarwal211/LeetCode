class Solution {
    public int longestPalindrome(String s) {
        int flag = 0;
        int strLength = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(hmap.containsKey(s.charAt(i))) {
                hmap.put(s.charAt(i), hmap.get(s.charAt(i)) + 1);
            }
            else {
                hmap.put(s.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                strLength = strLength + entry.getValue() - 1;
                flag = 1;
            }
            else
            {
                strLength = strLength + entry.getValue();
            }
        }
        if(flag == 1) {
            return strLength + 1;
        }
        return strLength;
        
    }
}