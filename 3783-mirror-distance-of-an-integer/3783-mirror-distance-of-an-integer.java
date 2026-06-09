class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        StringBuilder sb= new StringBuilder(String.valueOf(n));
        sb.reverse();
       
        int mirrorNum=Integer.parseInt(sb.toString());

        return Math.abs(num-mirrorNum);
    }
}