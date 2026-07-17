class Solution {
    public int climbStairs(int n) {
        int[]arr = new int[45];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for(int i = 0; i<arr.length-3; i++){
            arr[i+3] = arr[i+1] + arr[i+2];
        }
        return arr[n-1];
    }
}