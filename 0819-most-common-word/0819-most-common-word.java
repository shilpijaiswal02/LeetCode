class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       HashMap<String,Integer> map= new HashMap<>();
       HashSet<String> set = new HashSet<>();
       for(String ss: banned){
        set.add(ss);
       }
       String[] str = paragraph.toLowerCase().split("[^a-zA-Z0-9]+");
       for(int i=0;i<str.length;i++){
          String s= str[i];
          if(banned.length!=0 && set.contains(s)){
            continue;
          }
          map.put(s,map.getOrDefault(s,0)+1);

       }
          int max= Collections.max(map.values());
          StringBuilder sb = new StringBuilder();
          for(Map.Entry<String ,Integer> e: map.entrySet()){
            if(e.getValue()==max){
                sb.append(e.getKey());
                break; 
            }
          }

       
       return sb.toString();
    }
}