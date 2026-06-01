class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(!s.contains(i)){
               list.add(i);
            }
        }
       return list; 
    }
}