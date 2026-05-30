import java.util.Arrays;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int A=0;
        int B=0;
        int i=0;
        int j=1;
         A=arr[j]-arr[i];
         i++;
         j++;
        while(j<arr.length){
           B=arr[j]-arr[i];
           if(B!=A){
            return false;

           }
           i++;
           j++;
            
        }
        return true;
    }
}