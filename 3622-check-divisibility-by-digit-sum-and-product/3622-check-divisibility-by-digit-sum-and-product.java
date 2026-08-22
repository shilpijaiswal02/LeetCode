class Solution {
    public boolean checkDivisibility(int n) {
       int sum=0;
       int prod=1;
       int original=n;
       while(n!=0){
        int num=n%10;
        sum+=num;
        prod*=num;
        n=n/10;
       } 
      int div=sum+prod;
       if(original%div==0){
        return true;
       }

       return false;
    }
}