class Solution {
    public int maxProduct(int n) {
        int largest = 0;
        int secondLargest = 0;
        while(n>0){
            int r = n%10;
            n/=10;
            if(r>largest){
                secondLargest = largest;
                largest = r;
            }else if(r>secondLargest){
                secondLargest = r;
            }
        }
        return largest*secondLargest;
    }
}