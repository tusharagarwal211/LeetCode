class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length;
        
        if(k > arr[len - 1]) {
            return k + len;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= k) {
                k += 1;                
            }
        }
        
        return k;
    }
}