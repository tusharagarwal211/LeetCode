class Solution {
    public int minOperations(String[] logs) {
        int numOfOperations = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (numOfOperations > 0) {
                    numOfOperations--;
                }
            } else if (!logs[i].equals("./")) {
                numOfOperations++;
            }
        }
        return numOfOperations;
    }
}