class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
       ArrayList<Integer> list= new ArrayList<>();

       while(i<nums1.length&&j<nums2.length){
           if(nums1[i]<nums2[j]){
            list.add(nums1[i]);
            i++;
           }else if(nums1[i]>nums2[j]){
            list.add(nums2[j]);
            j++;
           }else{
             list.add(nums1[i]);
             list.add(nums2[j]);
             i++;j++;
           }
       }
       if(i!=nums1.length){
        while(i<nums1.length){
            list.add(nums1[i]);
            i++;
        }
       }
        if(j!=nums2.length){
        while(j<nums2.length){
            list.add(nums2[j]);
            j++;
        }
       }

       int midSize=list.size();
       int mid=0;
       double median=0;
       if(midSize%2!=0){
            mid=midSize/2;
           median=list.get(mid);
       }else{
        mid=midSize/2;
        double a=list.get(mid);
        double b= list.get(mid-1);
        median=(a+b)/2;
       }

       return median;
        
    }
}