class Solution {
    public int findLengthOfLCIS(int[] nums) {
      int count =0;
      int maxLen=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        count=0;
        for(int j=i;j<nums.length-1;j++){
            if(nums[j]<nums[j+1]){
                count++;
            }else{
                break;
            }
          }
          count++;
          if(maxLen<count){
            maxLen=count;
          }
        
       }
       return  maxLen; 
    }
}