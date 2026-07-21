class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
            int r = x%10;
            x/=10;
            //Checks for positive overflow
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&r>7)) return 0;
            //Checks for negative overflow
            if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10&&r< -8)) return 0;
            rev = rev*10+r;
        }
        return rev;
    }
}
/*Here we are checking if rev>max value/10 because everytime rev = rev*10 + r, so it will overflow
if rev==max value/10 which is 2147483647/10 = 214748364, after rev = rev*10 + r(here r need to be 7 at most) to make it 2147483640 + 7 
Same goes for min values
*/ 