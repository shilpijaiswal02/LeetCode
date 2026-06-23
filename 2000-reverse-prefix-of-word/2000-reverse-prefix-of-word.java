class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb= new StringBuilder(word);
       // boolean flag=false;
        
        for(int j=0;j<word.length();j++){
            if(word.charAt(j)==ch){
                int i=0;
                while(i<j){
                    char temp=word.charAt(i);
                    sb.setCharAt(i,word.charAt(j));
                    sb.setCharAt(j,temp);
                    i++;
                    j--;

                }
                break;
            }
        }
        return sb.toString();
    }
}