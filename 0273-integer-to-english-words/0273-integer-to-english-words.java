class Solution {
    static String convert(int n){
          String[] ones = {
    "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
    "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
    "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
};

String[] tens = {
    "", "", "Twenty", "Thirty", "Forty", "Fifty",
    "Sixty", "Seventy", "Eighty", "Ninety"
};
     String str="";
     
      if(n>=100){
         str+=ones[n/100]+" Hundred ";
         n=n%100;
      }
      if(n>=20){
         str+=tens[n/10]+" ";
         n=n%10;
      }
       if(n>0){
        str+=ones[n]; 
      }

      return str.trim();
    }
    public String numberToWords(int num) {
      String[] ones = {
    "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
    "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
    "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
};

String[] tens = {
    "", "", "Twenty", "Thirty", "Forty", "Fifty",
    "Sixty", "Seventy", "Eighty", "Ninety"
};
         String[] scale = {
            "",
           "Thousand",
             "Million",
            "Billion"
          };

          if(num==0) return "Zero";
          String result="";
          int scaleIdx=0;
         while(num>0){
           int part= num%1000;
           if(part!=0){
            String curr=convert(part);
            result=curr+" "+ scale[scaleIdx]+" "+result;
           }
           num=num/1000;
           scaleIdx++;

         }
        

return result.trim();

    }
}