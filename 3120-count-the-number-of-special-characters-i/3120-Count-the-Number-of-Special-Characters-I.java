import java.util.*;
class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        char[] ch = word.toCharArray();
        for(char l:ch){
            set.add(l);
        }
        int count = 0;
        for(char ele:set){
            if(((ele>='a'&&ele<='z')&&set.contains((char)(ele-32)))){
                count++;
            }
        }
        return count;
    }
}