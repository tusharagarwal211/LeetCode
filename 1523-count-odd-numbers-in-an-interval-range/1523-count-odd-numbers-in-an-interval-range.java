class Solution {
    public int countOdds(int low, int high) {
        int ans = -1;
        if(low % 2 != 0 && high % 2 != 0) {
            ans = ((high - low) / 2) + 1;
        }
        else if(low % 2 == 0 && high % 2 == 0) {
            ans = (high - low) / 2;
        }
        else if(low % 2 != 0 && high % 2 == 0 || low % 2 == 0 && high % 2 != 0) {
            ans = ((high - low) / 2) + 1;
        }
        
        return ans;
    }
}