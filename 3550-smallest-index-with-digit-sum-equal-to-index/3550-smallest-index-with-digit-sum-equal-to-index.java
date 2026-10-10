class Solution {
    public int smallestIndex(int[] nums) {
    int smallest=Integer.MAX_VALUE;
    boolean flag=false;
      for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                sum+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            if(sum==i){
                smallest=Math.min(smallest,i);
                flag=true;
            }
      }
      if(flag==false)return -1;
      return smallest;
    }
}