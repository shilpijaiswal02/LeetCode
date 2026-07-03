class Solution {
    public double minimumAverage(int[] nums) {
      //  double[] avg=new double[nums.length/2];
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        double min=Integer.MAX_VALUE;
        while(i<j){
         double average=(nums[i]+nums[j])/2.0;
           //  avg[i]=average;

             i++;
             j--; 
             min=Math.min(min,average);
                   
                               
       }
       return min;

       
    }
}