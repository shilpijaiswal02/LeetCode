class Solution {
    static int isVowel(String str){
        int count=0;
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            count++;
        }
        
      }
    return count;
    }
    public String reverseWords(String s) {
        String[] arr= s.split(" ");
        StringBuilder sb = new StringBuilder();
        int count =0;
        sb.append(arr[0]);
     
        int count1=isVowel(arr[0]);
         for(int i=1;i<arr.length;i++){
             sb.append(" ");  

            int count2=isVowel(arr[i]);
            if(count1==count2){
              sb.append(new StringBuilder(arr[i]).reverse());
                
            }else{
                sb.append(arr[i]);
            }
         }

         return sb.toString();


    }
}