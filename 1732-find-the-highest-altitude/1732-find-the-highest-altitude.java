class Solution {
    public int largestAltitude(int[] gain) {
      ArrayList<Integer> list= new ArrayList();
      list.add(0);
      int max=Integer.MIN_VALUE;
      for(int i=0;i<gain.length;i++){
        list.add(list.get(i)+gain[i]);

      } 
    
      for(int num:list){
        if(num>max){
            max=num;
        }
      }

      return max;

    }
}