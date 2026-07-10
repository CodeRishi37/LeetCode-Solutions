class Solution {
    public boolean isPowerOfFour(int n) {
        /*isPowerOfTwo = (n&(n-1)) == 0;
        isMultipleOfThree = ((n-1)%3==0);*/
        return ((n&(n-1))==0)&&((n-1)%3==0);
    }
}