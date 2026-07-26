class Solution {
    public int maximumProduct(int[] nums) {
        int firstMax = -1001;
        int secondMax = -1001;
        int thirdMax = -1001;
        int firstMin = 1001;
        int secondMin = 1001;
        for(int i = 0; i<nums.length; i++){
            int curr = nums[i];
            if(curr>firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = curr;
            }else if(curr>secondMax){
                thirdMax = secondMax;
                secondMax = curr;
            }else if(curr>thirdMax){
                thirdMax = curr;
            }
            if(curr<firstMin){
                secondMin = firstMin;
                firstMin = curr;
            }else if(curr<secondMin){
                secondMin = curr;
            }
        }
        int maxProduct = firstMax*secondMax*thirdMax;
        int minmaxProduct = firstMin*secondMin*firstMax;
        return (maxProduct>minmaxProduct)?maxProduct:minmaxProduct;
    }
}