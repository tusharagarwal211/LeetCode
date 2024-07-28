class Solution {
    public int addDigits(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        int rem = -1;
        int sum = 0;
        if(num<10){
            return num;
        }
        while(len > 1) {
            //38
            rem = num % 10;
            //rem=8
            num = num / 10;
            //num=3
            sum += rem;
            //sum = 8
            str = Integer.toString(num);
            len = str.length();
            if(len == 1) {
                sum += num;
                //11
                if(sum<10){
                    return sum;
                }
                num = sum;
                str = Integer.toString(num);
                len = str.length();
                sum = 0;
            }
        }
        
        return sum;
    }
}