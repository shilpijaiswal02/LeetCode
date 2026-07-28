class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1)return s;
        int len=s.length();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        if(len%2!=0){
             int mid=(len+1)/2;
             for(int i=mid-2;i>=0;i--){
                sb.append(s.charAt(i));
             }
             char[] arr = sb.toString().toCharArray();
              Arrays.sort(arr);
             sb = new StringBuilder(new String(arr));
             sb.append(s.charAt(mid-1));
             for(int i=mid;i<s.length();i++){
                sb2.append(s.charAt(i));
             }
             char[] arr2 = sb2.toString().toCharArray();
              Arrays.sort(arr2);
              sb2 = new StringBuilder(new String(arr2));
             sb.append(sb2.reverse());
        }else{
            int mid=len/2;
             for(int i=mid-1;i>=0;i--){
                sb.append(s.charAt(i));
             }
             char[] arr3 = sb.toString().toCharArray();
             Arrays.sort(arr3);

             sb = new StringBuilder(new String(arr3));

             for(int i=mid;i<s.length();i++){
                sb2.append(s.charAt(i));
             }
             char[] arr4 = sb2.toString().toCharArray();
            Arrays.sort(arr4);
            sb2 = new StringBuilder(new String(arr4));
             sb.append(sb2.reverse());
        }

        return sb.toString();
    }
}