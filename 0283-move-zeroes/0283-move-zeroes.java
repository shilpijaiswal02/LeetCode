class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                 j=i;
                 break;
            }
           
           
        }
        if(j==-1)return ;
        int temp;
        for(int i=j+1;i<nums.length;i++){
           if(nums[i]!=0){
             temp=nums[j];
             nums[j]=nums[i];
             nums[i]=temp;
             j++;
           }
        }
    }
}