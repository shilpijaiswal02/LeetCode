class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
       int i=0;
       int j=i+1;
       int repeated=0;
       while(i<j){
        if(nums[i]!=nums[j]){
            i++;
            j++;
            continue;
        }else {
            repeated=nums[i];
            break;
        }
       }
       return repeated;
       
    }
}