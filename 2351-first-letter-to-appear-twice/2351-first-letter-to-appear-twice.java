class Solution {
    public char repeatedCharacter(String s) {
       HashSet<Character> set = new HashSet<>();
       char res=' ';
       for(int i=0;i<s.length();i++){
          if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
          }else{
                res= s.charAt(i);
                break;
          }
          
       } 
       return res;
    }
}