class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
              sum+=nums[j];
            if(sum==target){
              return new int[]{i, j};
             
              }
              
         sum=nums[i];
            }
         sum=0;
        }
        return new int[]{};
    }
}
/*
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}*/
