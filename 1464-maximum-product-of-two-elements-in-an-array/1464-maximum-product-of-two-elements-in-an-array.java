class Solution {
    public int maxProduct(int[] nums) {
        
        int max1=Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for(int k=0;k<nums.length;k++){
            if(nums[k]>=max1){
                max2=max1;
                max1=nums[k];
            }else if(nums[k]>max2){
        
                max2=nums[k];
            }
        }

        return (max1-1)*(max2-1);
    }
}