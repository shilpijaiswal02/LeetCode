class Solution {
    public String addSpaces(String s, int[] spaces) {
         StringBuilder ans= new StringBuilder();
         int j=0;
        for(int i=0;i<spaces.length;i++){
            ans.append(s,j,spaces[i]);
             ans.append(' ');
            j=spaces[i];
            
        }
        ans.append(s,j,s.length());

        return ans.toString();
    }
}