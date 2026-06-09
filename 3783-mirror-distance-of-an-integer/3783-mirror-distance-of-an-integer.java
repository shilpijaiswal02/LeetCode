class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        String s= Integer.toString(n);
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
       
        int mirrorNum=Integer.parseInt(sb.toString());

        return Math.abs(num-mirrorNum);
    }
}