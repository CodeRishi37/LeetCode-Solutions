//Logic: a^a = 0, a^0 = a
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            res = res^nums[i];
        }
        return res;
    }
}