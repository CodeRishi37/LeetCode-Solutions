class Solution {
    public int maximumProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int curr:nums){
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
        return maxProduct>minmaxProduct?maxProduct:minmaxProduct;
    }
}