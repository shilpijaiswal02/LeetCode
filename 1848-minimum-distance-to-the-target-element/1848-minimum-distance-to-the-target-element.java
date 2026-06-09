class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int index=0;
        int res=Integer.MAX_VALUE;
    
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
               res=Math.min(res, Math.abs(index-start));
            }
        }

        return res;
    }
}