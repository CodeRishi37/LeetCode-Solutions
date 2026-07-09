import java.util.Arrays;
class Solution {
    public static boolean[] sieve(int n){
        boolean []isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        if(n>=0) isPrime[0] = false;
        if(n>=1) isPrime[1] = false;
        for(int p = 2;p*p<=n;p++){
            if(isPrime[p]){
                for(int multiple = p*p;multiple<=n;multiple+=p){
                    isPrime[multiple] = false;
                }
            }
        }
        return isPrime;
    }
    public int countPrimes(int n) {
        boolean []prime = sieve(n);
        int c = 0;
        for(int i = 2; i<n;i++){
            if(prime[i]) c++;
        }
        return c;
    }
}