import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> notseen = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x:nums){
            max = Math.max(x,max);
            min = Math.min(x,min);
            set.add(x);
        }
        for(int i = min+1; i<max; i++){
            if(!set.contains(i)){
                notseen.add(i);
            }
        }
        return notseen;

    }
}