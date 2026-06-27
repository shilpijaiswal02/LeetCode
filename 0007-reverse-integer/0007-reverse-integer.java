class Solution {
    public int reverse(int x) {
        StringBuilder sb= new StringBuilder();
        int num=0;
        int op=0;
        if(x<0)sb.append('-');
       
        while(x!=0){
            num=x%10;
            op++;
            if(op==1 && num==0)continue;
            else{
               sb.append(Math.abs(num));

            }
            x=x/10;
        }
      if (sb.length() == 0 || sb.toString().equals("-")) return 0;
        
        
        long parse = Long.parseLong(sb.toString());
        
        
        if (parse < Integer.MIN_VALUE || parse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)parse;
    }
}