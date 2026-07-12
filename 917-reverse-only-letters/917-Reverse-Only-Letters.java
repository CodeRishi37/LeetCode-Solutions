class Solution {
    public String reverseOnlyLetters(String s) {
        char []ch = s.toCharArray();
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(!Character.isLetter(ch[low])){
                low++;
            }else if(!Character.isLetter(ch[high])){
                high--;
            }
            else{
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
        }
        return new String(ch);
    }
}