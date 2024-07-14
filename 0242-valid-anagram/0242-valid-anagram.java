class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int value = 0;
        
        if(sLength != tLength) {
            return false;
        }
        
        HashMap<Character, Integer> sHmap = new HashMap<>();
        HashMap<Character, Integer> tHmap = new HashMap<>();
        
        for(int i = 0; i < sLength; i++) {
            if(sHmap.containsKey(s.charAt(i))) {
                value = sHmap.get(s.charAt(i)) + 1;
                sHmap.put(s.charAt(i), value);
            }
            else {
                sHmap.put(s.charAt(i), 1);
            }
            if(tHmap.containsKey(t.charAt(i))) {
                value = tHmap.get(t.charAt(i)) + 1;
                tHmap.put(t.charAt(i), value);
            }
            else {
                tHmap.put(t.charAt(i), 1);
            }
        }
        
        boolean ans = sHmap.equals(tHmap);
        
        return ans;
    }
}