class Solution {
    public int[] resultArray(int[] nums) {
        int n= nums.length;
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        int[] result= new int[n];

        for(int i=0;i<n;i++){
            if(list1.isEmpty()){
               list1.add(nums[i]);
            }else if( list2.isEmpty()){
                list2.add(nums[i]);
            }else if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
       int j=0; 
        for(int i=0;i<list1.size();i++){
           result[i]=list1.get(i);
           j++;
        }
        for(int i=0;i<list2.size();i++){
           result[j]=list2.get(i);
           j++;
        }
      return result;
    }
}