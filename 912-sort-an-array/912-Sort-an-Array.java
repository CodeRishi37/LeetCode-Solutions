import java.util.Random;
class Solution {
    Random random = new Random();
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void quicksort(int[] nums, int start, int end){
        if(start>=end) return;
        int randidx = start + random.nextInt(end-start+1);
        swap(nums,start,randidx);
        int pivot = nums[start];
        int i = start+1;
        int j = end;
        while(i<=j){
            while(i<=end&&nums[i]<=pivot){
                i++;
            }
            while(j>start&&nums[j]>=pivot){
                j--;
            }
            if(i<j){
                swap(nums,i,j);
            }
        }
        swap(nums,start,j);
        quicksort(nums,start,j-1);
        quicksort(nums,j+1,end);
    }
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
}