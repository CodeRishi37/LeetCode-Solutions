class Solution {
    public int[] plusOne(int[] digits) {
        //We will traverse the array from last
        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]<9){ //We will check if the last number in not 9, if not add 1 to it
                digits[i]++; 
                return digits; //We will return it immediately 
            }
            digits[i] = 0; //else the array will be full 0 0 0 0 .. for case of 9 9 9 9..
        }
        int[] newDigit = new int[digits.length+1]; //We will create a new array then, of length+1
        newDigit[0] = 1;//And initialise first element as 1
        return newDigit;
    }
}