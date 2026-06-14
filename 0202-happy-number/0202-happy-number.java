class Solution {
    public boolean isHappy(int n) {
       int original=n;
        HashSet<Integer> set= new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
           int sum=0;
          
           while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;
           }
           n=sum;

        }
        if(n==1)return true;
        else return false;
    }
}