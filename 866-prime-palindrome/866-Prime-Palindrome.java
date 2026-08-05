class Solution {
    public boolean checkPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i*i<= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPd(int n) {
        if(n<10) return true;
        int rev = 0;
        int num = n;
        while (num > 0) {
            rev = rev * 10 + (num%10);
            num /= 10;
        }
        return rev == n;
    }

    public int primePalindrome(int n) {
        if(n<=2) return 2;
        if(n%2==0){
            n++;
        }
        if(n>=929&&n<=10301){ //3 --> 5
            n = 10301;
        }
        if(n>=98689&&n<=1003001){ //5 --> 7
            n = 1003001;
        }
        if(n>=9989900){ //Adding a constraint as all palindromes of even digits are divisible by 11
            n = 100030001;
        }
        while(true){
            if(checkPd(n)&&checkPrime(n)){
                return n;
            }
            n+=2;
        }
    }
}
