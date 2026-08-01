class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int x:nums){
            if(nums[j]!=x){
                j++;
            nums[j] = x;
            }
        }
        return j+1;
    }
}