class Solution {
    public String removeDuplicateLetters(String s) {
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

      }
      HashSet<Character> seen = new HashSet<>();
      Stack<Character> st= new Stack<>();
      for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        map.put(ch,map.get(ch)-1);
        if(seen.contains(ch)){
            continue;
        }

        while(!st.isEmpty()&& st.peek()>ch && map.get(st.peek())>0){
            seen.remove(st.pop());


        }
        st.push(ch);
        seen.add(ch);

      }
      StringBuilder sb = new StringBuilder();
      for(char ch : st){
        sb.append(ch);
      }


       return sb.toString();
       
    }

}