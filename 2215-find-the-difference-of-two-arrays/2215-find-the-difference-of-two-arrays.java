class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list= new ArrayList<>();
        Set<Integer> list1= new HashSet<>();
        Set<Integer> list2= new HashSet<>();

        for(int i=0;i<nums1.length;i++){
              boolean flag= true;
           
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                  flag=false;
                }
            }
            if(flag==true){
                list1.add(nums1[i]);
            }
        }
         list.add(new ArrayList<>(list1));


         for(int i=0;i<nums2.length;i++){
              boolean flag= true;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                  flag=false;
                }
            }
            if(flag==true){
                list2.add(nums2[i]);
            }
        }
         list.add(new ArrayList<>(list2));

        return list;
    }
}