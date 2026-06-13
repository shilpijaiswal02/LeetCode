class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr= new ArrayList<>();
           HashMap<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       int majority=nums.length/3;
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()>majority){
            arr.add(entry.getKey());
        }

       }
       return arr;
    }
}