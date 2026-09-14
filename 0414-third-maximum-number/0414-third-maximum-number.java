class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
       ArrayList<Integer> list = new ArrayList<>(set);
       Collections.sort(list);
        
        

      //  Arrays.sort(nums);
        if(list.size()<3){
            return list.get(list.size()-1);
        }
        return list.get(list.size()-3);
    }
}