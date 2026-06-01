class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] arr= new int[n+1];
         int[] arr2= new int[2];
        for(int num:nums){
            arr[num]++;
        }
      for(int j=1;j<=n;j++){
        if(arr[j]==2)
         arr2[0]=j;
      
      if(arr[j]==0){
        arr2[1]=j;
      }
      }
      return arr2;
    }
}