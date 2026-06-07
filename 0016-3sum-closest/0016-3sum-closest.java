class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int diff=0;
        int resSum=Integer.MAX_VALUE;
        int  Sum=0;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
               int sum=nums[i]+nums[j]+nums[k];
               if(sum==target){
                 return sum;
                }
                diff=Math.abs(sum-target);
                if(diff<resSum){
                    resSum=diff;
                    Sum=sum;
                }
               if(sum<target){
                j++;
               
               }
               else{
                   k--;
                }
               }
              
            }
        
        return Sum;
    }
}