class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

         int totalTime=0;
          int totalTime2=0;
         int result=Integer.MAX_VALUE;
          int result2=Integer.MAX_VALUE;
          int finalFinish=0;
        for(int i=0;i<landStartTime.length;i++){
         for(int j=0;j<waterStartTime.length;j++){
           
               totalTime=landStartTime[i]+landDuration[i];
               if(waterStartTime[j]>totalTime){
                int wait=waterStartTime[j]-totalTime;
                totalTime+=wait;
               
               }
                totalTime+=waterDuration[j];
            if(totalTime<result){
                result=totalTime;
            }


             totalTime2=waterStartTime[j]+waterDuration[j];
               if(landStartTime[i]>totalTime2){
                int wait=landStartTime[i]-totalTime2;
                totalTime2+=wait;
                
               }
               totalTime2+=landDuration[i];
            if(totalTime2<result2){
                result2=totalTime2;
            }

             finalFinish=Math.min(result,result2);

        }

        }
        return  finalFinish;
       
    }
}