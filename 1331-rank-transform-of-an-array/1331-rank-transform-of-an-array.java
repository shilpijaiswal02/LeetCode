class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(arr);
       HashMap<Integer,Integer> map= new HashMap<>();
       int rank=1;
       for(int i=0;i<arr.length;i++){
         if (!map.containsKey(arr[i])){
            map.put(arr[i],rank++);
           }
       }
        int[] res= new int[copy.length];
        for(int i=0;i<copy.length;i++){
              res[i]=map.get(copy[i]);
        }
       

       
       return res;

    }
}