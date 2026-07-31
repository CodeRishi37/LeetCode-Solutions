//Logic: One pointer first, one at last, first one will check if the element is even or not- if even it will move by one step and do check again, if not it will swap with last element and last element will move 1 step backward
class Solution {
    public void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[i]%2==0){
                i++;
            }else{
                swap(nums,i,j);
                j--;
            }
        }
        return nums;
    }
}