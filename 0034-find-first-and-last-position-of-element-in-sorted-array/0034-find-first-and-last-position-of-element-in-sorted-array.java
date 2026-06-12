class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]= new int[2];
        if(nums.length==1 && nums[0]==target){
            return arr;
        }
         boolean flag=false;
          boolean flag1=false;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==target){
                arr[0]=i;
                flag1=true;
                
            }
             if(nums[j]==target){
                arr[1]=j;
                flag=true;
            }

            if(flag1==false)i++;
            if(flag==false)j--;
            if(flag1==true&& flag==true)break;
        }

        if(flag1==false || flag==false){
            arr[0]=-1;
            arr[1]=-1;
        }
        
        return arr;
    }
}