class Solution {
    public long findTheArrayConcVal(int[] nums) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=nums.length-1;
        long sum=0;
        while(i<=j){
            if(i==j){
                sb.append(nums[i]);
                 
            }else{
            sb.append(nums[i]);
            sb.append(nums[j]);

            }
           sum+=Long.parseLong(sb.toString());
           i++;
           j--;
           sb.setLength(0);
        }

        return sum;
    }
}