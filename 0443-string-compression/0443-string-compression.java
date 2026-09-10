/*class Solution {
    public int compress(char[] chars) {
      LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
      for(int i=0;i<chars.length;i++){
        map.put(chars[i],map.getOrDefault(chars[i],0)+1);
      }
      StringBuilder sb = new StringBuilder();
      for(Map.Entry<Character,Integer> entry: map.entrySet()){
         char ch =entry.getKey();
          int key=entry.getValue();
            sb.append(ch);
          if(key>1){
              
               sb.append(key);
          }
       
      }
      for(int i=0;i<sb.length();i++){
        chars[i]=sb.charAt(i);
      }
    return sb.length();
    
    }
}*/
class Solution {
    public int compress(char[] chars) {

        int index = 0;
        int i = 0;

        while (i < chars.length) {

            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            chars[index++] = ch;

            if (count > 1) {
                String num = String.valueOf(count);

                for (char c : num.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}