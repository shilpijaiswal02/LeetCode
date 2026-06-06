class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else if(nums[i]==1){
                one++;
            }else{
                two++;
            }
        }

        for(int i=0;i<zero;i++){
            nums[i]=0;
        }
        
        for(int j=zero;j<zero+one;j++){
            nums[j]=1;
        }
        for(int k=one+zero;k<one+zero+two;k++){
            nums[k]=2;
        }
     /*int low=0;
     int mid=0;
     int high=nums.length-1;
     while(mid<=high){
        
        if(nums[mid]==0){
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;
        
        }
        else if(nums[mid]==1){
            mid++;
        }
        else if(nums[mid]==2){
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
        }
     } */
     System.out.println(Arrays.toString(nums));
       
    }
}