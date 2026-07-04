class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> set= new HashSet<>();
      //  int count =0;
        int i=0;
        int j= nums.length-1;
        while(i<j){
            double avg= (nums[i]+nums[j])/2.0;
            set.add(avg);
            i++;
            j--;

        }

        
       return set.size();
    }
}