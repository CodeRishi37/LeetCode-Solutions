class Solution {
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean isThree(int n) {
        if(n<=1) return false;
        int root = (int)Math.sqrt(n);
        if(root*root!=n) return false;
        return isPrime((int)Math.sqrt(n));
    }
}