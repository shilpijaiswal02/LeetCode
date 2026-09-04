class Solution {
    public int majorityElement(int[] nums) {
       int len =nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        int key=entry.getKey();
        int val=entry.getValue();
        if(val>len){
            return key;
        }
     }
     return -1;

    }
}