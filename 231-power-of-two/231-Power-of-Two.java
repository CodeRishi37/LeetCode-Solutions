//Logic: n&(n-1)is zero for 0,1,2,4,8,16 ..... (0,1,10,100,1000,1000....)
//16 (10000)& 15(1111) = 0 
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0)&&((n&(n-1))==0);
    }  
}
