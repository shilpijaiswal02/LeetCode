class Solution {
    public int largestAltitude(int[] gain) {
      ArrayList<Integer> list= new ArrayList();
      list.add(0);
      for(int i=0;i<gain.length;i++){
        int altitude=list.get(i)+gain[i];
        list.add(altitude);
      } 
      int max=Integer.MIN_VALUE;
      for(int num:list){
        if(num>max){
            max=num;
        }
      }

      return max;

    }
}