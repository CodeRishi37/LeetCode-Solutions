import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer>rom = new HashMap<>();
        rom.put('I',1);
        rom.put('V',5);
        rom.put('X',10);
        rom.put('L',50);
        rom.put('C',100);
        rom.put('D',500);
        rom.put('M',1000);
        int result = 0;
        for(int i = 0; i<s.length(); i++){
            int curr = rom.get(s.charAt(i));
            if(i<s.length()-1&&curr<rom.get(s.charAt(i+1))){
                result -= curr;
            }else{
                result += curr;
            }
        }
        return result;
    }
}