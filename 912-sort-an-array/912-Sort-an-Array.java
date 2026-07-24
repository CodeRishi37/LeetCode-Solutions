import java.util.Random;
class Solution {
    Random random = new Random();
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void quicksort(int[] nums, int start, int end){
        if(start>=end) return; //We will end when start>end
        int randidx = start + random.nextInt(end-start+1);
        swap(nums,start,randidx);
        int pivot = nums[start];//First we will choose a random index starting from start yo end and swap the value with start, that will be out pivot
        int i = start+1; //i will be next index of pivot
        int j = end; //j will be last index
        while(i<=j){
            while(i<=end&&nums[i]<=pivot){ //we will stop i index while traversing from i to end at where nums[i]>pivot
                i++;
            }
            while(j>start&&nums[j]>=pivot){ //we will stop j index while traversing from j to start at where nums[j]<=pivot
                j--;
            }
            if(i<j){ //if i<j or i and j not crossed eachother, we will swap them
                swap(nums,i,j);
            }
        }
        swap(nums,start,j); //here i and j crossed eachother, so we will swap pivot element with nums[j]
        quicksort(nums,start,j-1);//for the left side of pivot
        quicksort(nums,j+1,end);//for the right side of pivot
    }
    public int[] sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        return nums;
    }
}