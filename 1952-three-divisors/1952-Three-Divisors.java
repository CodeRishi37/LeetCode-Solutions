//Logic: Squares of all prime numbers have exactly 3 divisors: 1, its root, it
class Solution {
    //First we need a function to check if a number is prime or not
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean isThree(int n) {
        if(n<=1) return false;//For edge case
        //Now we need to filter the perfect square ones
        int root = (int)Math.sqrt(n);
        if(root*root!=n) return false; //Here we get the perfect squares e.g. 4,9,25...
        //Now we are checking if its root is prime or not
        return isPrime(root);
    }
}