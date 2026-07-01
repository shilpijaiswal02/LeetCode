class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length()-1;
        int i=0;
        int j=n;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                return Math.min(i,j);

            }
            i++;
            j--;
        }
        return -1;
    }
}