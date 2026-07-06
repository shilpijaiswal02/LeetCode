class Solution {


    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        String [] arr=s.split(" ");

        for(int k=0;k<arr.length;k++){
            char[] ch = arr[k].toCharArray();
            int i=0;
            int j=ch.length-1;
          
            while(i<j){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;

            }
           sb.append(new String(ch));

           if(k!=arr.length-1){
            sb.append(" ");
           }

        }

        return sb.toString();

    
    }
}