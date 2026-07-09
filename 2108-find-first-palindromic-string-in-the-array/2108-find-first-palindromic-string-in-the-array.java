class Solution {
    public String firstPalindrome(String[] words) {
        boolean flag= true;
        for(int i=0;i<words.length;i++){
            String str=words[i];
            int j=0;
            int k=str.length()-1;
            while(j<k){
                if(str.charAt(j)!=str.charAt(k)){
                   flag=false; 
                   break;
                }
                j++;
                k--;
            }
            if(flag==false){
                flag=true;
            }else{
                return str;
            }
        }
        return "";
    }
}