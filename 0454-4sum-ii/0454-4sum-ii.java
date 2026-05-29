class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
       Map<Integer,Integer> map=new HashMap<>();
       int sum=0;
       int count=0;
         for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
            sum=nums1[i]+ nums2[j]; 
            map.put(sum, map.getOrDefault(sum,0)+1);
         }
        }
         int sum2=0;
         for(int k=0;k<nums3.length;k++){
            for(int l=0;l<nums4.length;l++){
                sum2=nums3[k]+ nums4[l]; 

                if(map.containsKey(-sum2)){
                    count+=map.get(-sum2);
                }
            }
         }

       return count;






     /* List<List<Integer>> list = new ArrayList<>();

        int count=0;
        for(int i=0;i<nums1.length;i++){
          for(int j=0;j<nums2.length;j++){
          for(int k=0;k<nums3.length;k++){
          for(int l=0;l<nums4.length;l++){
              long sum=(long)nums1[i]+nums2[j]+nums3[k]+nums4[l];
              if(sum==0){
                list.add(Arrays.asList(nums1[i],nums2[j],nums3[k],nums4[l]));
                count=list.size();

              }
        }
        }
        }
        }
        return count;*/
    }  
        
}