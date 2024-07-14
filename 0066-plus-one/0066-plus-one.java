class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int i = len - 1;
        int count = 0;
        
        if(digits[i] < 9) {
            digits[i] += 1;
            return digits;
        }
        else {
            while(digits[i] == 9) {
                digits[i] = 0;
                if(i != 0) {
                    i--;
                }
                count++;
            }
            if(count == len) {
                int[] arr = new int[len + 1];
                Arrays.fill(arr, 0);
                arr[0] = 1;
                return arr;
            }
            digits[i] += 1;
            return digits;
        }
    }
}