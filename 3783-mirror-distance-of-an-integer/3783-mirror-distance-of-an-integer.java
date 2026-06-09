class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        String s= Integer.toString(n);
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        int mirrorNum=Integer.parseInt(sb.toString());

        return Math.abs(num-mirrorNum);
    }
}