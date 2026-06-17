class Solution {
    public int findPeakElement(int[] nums) {
         int n =nums.length;
         int peak=nums[0];
         int i=0;
         int j=i+1;
        while(i<j && j<n){
            
           if(i==0){
            if(nums[i]>nums[j]){
             return i;
            }
             else{
                i++;
                j++;
               continue; 
             } 
            
           }

           if(nums[i]>nums[j] && nums[i]>nums[i-1]){
             return i;
           }
           else{
             i++;
             j++;
           }

         }

        int m=0;
        if(n == 1) return 0;
        if( n-2>=0 && nums[n-1]>nums[n-2] )
          m =n-1;
         
        
         return m;

    }
}