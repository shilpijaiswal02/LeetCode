class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int score=0;
        while(n>0){
            int s=n%10;
            map.put(s,map.getOrDefault(s,0)+1);
            n=n/10;
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
             score+=entry.getKey()*entry.getValue();
        }
        return score;
    }
}