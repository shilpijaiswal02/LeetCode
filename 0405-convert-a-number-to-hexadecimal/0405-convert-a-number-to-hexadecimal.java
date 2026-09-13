class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";

        }
        char[] hex="0123456789abcdef".toCharArray();
        long n= num & 0xffffffffL;
        StringBuilder sb = new StringBuilder();

        while(n>0){
            int rem =(int)(n%16);
            sb.append(hex[rem]);
            n=n/16;
        }
          
          return sb.reverse().toString();



          
    }
}