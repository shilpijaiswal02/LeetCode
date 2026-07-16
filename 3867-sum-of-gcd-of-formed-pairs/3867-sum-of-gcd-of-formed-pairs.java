class Solution {
    public static long gcd(long a,long b){
        if(b==0){
            return a; 
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        long[] prefixGcd=new long[nums.length];
        long greatest=nums[0];
        for(int i=0;i<nums.length;i++){
            long num=nums[i];
            if(greatest<nums[i]){
                greatest=nums[i];
            }
            prefixGcd[i]=gcd(num,greatest);
            
        }
        Arrays.sort(prefixGcd);
        long sum=0;
        int j=0;
        int k=prefixGcd.length-1;
        while(j<k){
           sum+=gcd(prefixGcd[j],prefixGcd[k]);
        j++;
        k--;
        }
        return sum;
    }
}