class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k=k % n;

        ArrayList<Integer> list= new ArrayList<>();
        for(int i=n-k;i<nums.length;i++){
           list.add(nums[i]);
        }
        for(int j=0;j<n-k;j++){
           list.add(nums[j]);
        }
      for(int i=0;i<n;i++){
        nums[i]=list.get(i);
      }
    }
}


