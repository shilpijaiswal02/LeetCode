class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0;
        int right=num;
        
        while(left<=right){
            int mid=left + (right - left) / 2;
            long val = (long) mid * mid;
            if(val>num){
                right=mid-1;

            }else if(val<num){
                left=mid+1;

            }else{
                return true;
            }
        }

        return false;
    }
}