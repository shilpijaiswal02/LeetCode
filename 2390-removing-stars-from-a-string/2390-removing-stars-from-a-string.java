class Solution {
    public String removeStars(String s) {
     Stack<Character> str= new Stack<>();
     for(char ch: s.toCharArray()){
        if(ch=='*'){
            if(!str.isEmpty())
              str.pop();

        }else{
            str.push(ch);
        }
        }
     StringBuilder sb= new StringBuilder();
     for(char val:str){
         sb.append(val);  
     }
     return sb.toString();   
    }
}