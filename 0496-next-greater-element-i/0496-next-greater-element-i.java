class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr= new int[nums1.length];
       
         for(int i=0;i<nums1.length;i++){
            int idx=0;
             for(int k=0;k<nums2.length;k++){
                if(nums1[i]==nums2[k]){
                    idx=k;
                    break;
                }
             }

             arr[i]=-1;
            for( int j=idx+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    arr[i]=nums2[j];
                    break;
                }
            }
            
         }

         return arr;
    }
}