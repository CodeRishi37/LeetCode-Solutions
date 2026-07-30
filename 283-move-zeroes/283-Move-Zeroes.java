/*Logic: j --> trace the non-zero ones' relative order
            i --> traces non zero elements and swap with j (j++)*/
class Solution {
    static void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int i = 0; int j = 0;
        while(i<nums.length){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
            i++;
            }
        }
    }