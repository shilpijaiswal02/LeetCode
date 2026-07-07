class Solution {
    public long sumAndMultiply(int n) {
       StringBuilder sb= new StringBuilder();
       int sum=0;
     while(n!=0){
        int x=n%10;
        if(x!=0){
            sum+=x;
           sb.append(x);
        }
        n=n/10;
     } 
      if (sb.length() == 0) {
            return 0;
        }
     long number=Long.parseLong(sb.reverse().toString());

      return (long)sum*number;

    }
}