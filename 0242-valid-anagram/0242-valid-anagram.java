class Solution {
    public boolean isAnagram(String s, String t) {
      /*  if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }
        for(int num:map.values()){
            if(num!=0){
                return false;
            }
        }
        return true;
        */
        if(s.length()!=t.length()){
            return false;
        }
        int[] num= new int[26];
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
             num[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
             num[ch-'a']--;
        }
         for(int i=0;i<num.length;i++){
            if(num[i]!=0)return false;
         }

        return true;
    }
}