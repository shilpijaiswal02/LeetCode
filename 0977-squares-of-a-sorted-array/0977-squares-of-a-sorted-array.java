class Solution {
    public int[] sortedSquares(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int i=0;
        int j=nums.length-1;
        int [] arr= new int[nums.length];
        int m=arr.length-1;
        while(i<=j){
            if(nums[i]<nums[j]){
                arr[m]=nums[j];
                j--;
                m--;

            }
            else{
                arr[m]=nums[i];
                i++;
                m--;
            }

        }
        return arr;
    }
}