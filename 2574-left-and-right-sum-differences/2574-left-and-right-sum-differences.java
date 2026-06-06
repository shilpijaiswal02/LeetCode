class Solution {
    public int[] leftRightDifference(int[] nums) {
      int[] leftSum=new int[nums.length];
      int[] rightSum=new int[nums.length];
        int n= nums.length;
          leftSum[0]=0;
        for(int i=0;i<n-1;i++){
            leftSum[i+1]=nums[i]+leftSum[i];
        }
        rightSum[n-1]=0;
         for(int i=n-1;i>0;i--){
            rightSum[i-1]=nums[i]+rightSum[i];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return ans;
    }
}