class Solution {
    public static int gcd(int a, int b){
        int r = a%b;
        if(r==0) return b;
        return gcd(b,r);
    }
    public int findGCD(int[] nums) {
        int mn = nums[0];
        int mx = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i]<mn) mn = nums[i];
            else if(nums[i]>mx) mx = nums[i];
        }
        return gcd(mx,mn);
    }
}