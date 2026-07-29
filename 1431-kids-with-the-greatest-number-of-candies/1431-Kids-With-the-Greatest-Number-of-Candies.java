import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int maxCandy = 0;
        for(int c:candies){
            if(c>maxCandy) maxCandy = c;
        }
        for(int i = 0; i<candies.length; i++){
            result.add(candies[i]+extraCandies>=maxCandy);
        }
        return result;
    }
}