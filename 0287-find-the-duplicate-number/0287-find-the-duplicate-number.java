class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
       int i=0;
       int j=i+1;
       int repeated=0;
       while(i<j){
        if(nums[i]==nums[j]){
            repeated=nums[i];
            break;
        }
        i++;
        j++;
       }
       return repeated;
       
    }
}