class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(start<end){
        //First we get the maximul values of both side
            leftMax = Math.max(leftMax,height[start]);
            rightMax = Math.max(rightMax,height[end]);
        //If height[start] < height[end] then 
            if(height[start]<height[end]){
                total+=leftMax - height[start];
                start++;
            }else{
                total+=rightMax - height[end];
                end--;
            }
        }
            return total;
    }
}