class Solution {
    static int sum(int num){
        int add = 0;
        while(num!=0){
            add+=(num%10);
            num/=10;
        }
        return add;
    }
    public int addDigits(int num) {
        while(num>9){
            num = sum(num);
        }
        return num;
        }
    }
