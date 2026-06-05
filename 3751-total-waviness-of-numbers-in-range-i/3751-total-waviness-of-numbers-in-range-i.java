class Solution {
    public int totalWaviness(int num1, int num2) {
         int waviness=0;
        for(int i=num1;i<=num2;i++){
             waviness+=getWaviness(i);
             }
             
        return waviness;
        
    }
    public static int  getWaviness(int i){
        String s= Long.toString(i);
        int count=0;
        if(s.length()<3){
          return 0;
        }
        else{
           
            for(int j=1;j<s.length()-1;j++){
                int prev=j-1;
                int curr=j;
                int next=j+1;
         
                if((s.charAt(curr)>s.charAt(prev)&& s.charAt(curr)>s.charAt(next))||(s.charAt(curr)<s.charAt(prev)&&s.charAt(curr)<s.charAt(next))){
                   count++;
                }
            }
        }
        return count;

    }
}