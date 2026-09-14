class Solution {
    public int findPeakElement(int[] nums) {
         if(nums.length==1){
            return 0;
         }
         int i=0;

       
                if(nums[i+1]<nums[i]){
                    return 0;
                }
            

        i++;
       
         while(i<nums.length-1){
        
                if(nums[i-1]<nums[i]&& nums[i]>nums[i+1]){
                   return i;
                }
                i++;
            
         }
         
         if(i==nums.length-1){
                if(nums[i-1]<nums[i]){
                    return i;
                }
            }
     return -1;

    }
}