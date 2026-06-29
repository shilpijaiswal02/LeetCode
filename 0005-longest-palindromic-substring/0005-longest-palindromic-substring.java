class Solution {
    static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
        return false;
        }
        i++;
        j--;
     } 
      return true;

    }
    public String longestPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
         
         for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String ss=s.substring(i, j);
                boolean flag=palindrome(ss);
                if(flag==true && sb.length()<ss.length()){
                   sb.setLength(0);
                   sb.append(ss);
                }
            }

         }

         return sb.toString();
    }
}