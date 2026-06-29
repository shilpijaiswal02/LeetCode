
import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
     StringBuilder sb= new StringBuilder();

     ArrayList<Integer> list= new ArrayList<>();
     for(int num:digits){
        sb.append(num);
     }

     java.math.BigInteger num=new java.math.BigInteger(sb.toString());

     num=num.add(BigInteger.ONE);
     while(!num.equals(BigInteger.ZERO)){

        list.add(num.mod(BigInteger.TEN).intValue());
        num=num.divide(BigInteger.TEN);

     }
     Collections.reverse(list);
     int[] list1=new int[list.size()];
     for(int i=0;i<list1.length;i++){

        list1[i]=list.get(i);
     }

     return list1;
    }
}