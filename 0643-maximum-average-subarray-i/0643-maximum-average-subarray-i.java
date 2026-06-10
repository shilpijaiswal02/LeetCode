/*class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int i=0;
        int j=i+k-1;
          long sum=0;
        long max=Long.MIN_VALUE;
        while(j<nums.length){
            for(int l=i;l<=j;l++){
              sum+=nums[l];
            }
            if(sum>max){
                max=sum;
            }
            sum=0;
            i++;
            j++;
            
    
        }
        return (double)max/k;
        
    }
}*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        long sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        long max = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return (double) max / k;
    }
}