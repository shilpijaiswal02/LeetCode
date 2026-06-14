class Solution {
    public boolean checkGoodInteger(int n) {
        int original=n;
        int digitSum=0;
        int squareSum=0;
        while(n>0){
            digitSum+=n%10;
            n=n/10;
        }
        while(original>0){
            squareSum+=(original%10)*(original%10);
            original=original/10;
        }
        
        int diff=squareSum-digitSum;
        if(diff>=50)return true;

        return false;

    }
}