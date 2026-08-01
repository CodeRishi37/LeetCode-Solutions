class Solution {
    static int count(int num){
        int c = 0;
        while(num>0){
            num/=10;
            c++;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            if(count(nums[i])%2==0){
                n++;
            }
        }
        return n;
    }
}