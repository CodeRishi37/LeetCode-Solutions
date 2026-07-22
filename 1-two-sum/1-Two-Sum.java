import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //We will make a hashmap first
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            //Now we will iterate through the array and get complement of nums[i] i.e. complement = target - nums[i]
            int complement = target - nums[i];
            //We will check if the complement is already present in the hashmap, if yes we will return its index by map.get() and the current element
            if(map.containsKey(complement)){
                return new int[]{
                    map.get(complement),i
                };
            }
            //else we will add the number along with index in hashmap
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}