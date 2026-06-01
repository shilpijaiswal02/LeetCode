class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str= new StringBuilder();
          int len=Math.min(word1.length(),word2.length());
          for(int i=0;i<len;i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
          }
          if(word1.length() > len){
              str.append(word1.substring(len));
          }
          if(word2.length() > len){
            str.append(word2.substring(len));
         }
          return str.toString();
    }
}