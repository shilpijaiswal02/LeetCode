class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> s= new HashSet<>();
        Set<Integer> processed= new HashSet<>();
       
        for(int i=0;i<arr.length;i++){
           
             if(processed.contains(arr[i])){
                  continue;
             }
             int count=0;
             for(int j=0;j<arr.length;j++){
               if(arr[i]==arr[j]){
                    count++;
                }
             }
             processed.add(arr[i]);
            
             if(s.add(count)!=true){
                return false;
             }

             
        }
        return true;
    }
}