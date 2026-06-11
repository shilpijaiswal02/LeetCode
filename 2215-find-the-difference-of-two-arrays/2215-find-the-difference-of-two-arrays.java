class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list= new ArrayList<>();
        Set<Integer> list1= new HashSet<>();
        Set<Integer> list2= new HashSet<>();
        

         for(int  i: nums1){
            list1.add(i);
        }
         for(int j: nums2){
            list2.add(j);
        }
        List<Integer> list3= new ArrayList<>();
        List<Integer> list4= new ArrayList<>();

       
        
        for(int num:list1){
            if(!list2.contains(num)){
                list3.add(num); 
            }
        }
          list.add(new ArrayList<>(list3));
        for(int num:list2){
            if(!list1.contains(num)){
                list4.add(num); 
            }
        }
          list.add(new ArrayList<>(list4));
/*
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
*/
    
        return list;
    }
}