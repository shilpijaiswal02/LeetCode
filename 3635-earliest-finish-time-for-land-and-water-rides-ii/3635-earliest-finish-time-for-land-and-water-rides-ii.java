class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

       long ans = Math.min(
    solve(landStartTime, landDuration, waterStartTime, waterDuration),
    solve(waterStartTime, waterDuration, landStartTime, landDuration)
);

return (int) ans;
}

private long solve(int[] firstStart, int[] firstDur,
                   int[] secondStart, int[] secondDur) {

    int m = secondStart.length;

    int[][] rides = new int[m][2];

    for (int i = 0; i < m; i++) {
        rides[i][0] = secondStart[i];
        rides[i][1] = secondDur[i];
    }

    Arrays.sort(rides, (a, b) -> a[0] - b[0]);

    int[] starts = new int[m];
    long[] prefMinDur = new long[m];
    long[] suffMinOpenDur = new long[m];

    for (int i = 0; i < m; i++) {
        starts[i] = rides[i][0];
    }

    prefMinDur[0] = rides[0][1];

    for (int i = 1; i < m; i++) {
        prefMinDur[i] = Math.min(prefMinDur[i - 1], rides[i][1]);
    }

    suffMinOpenDur[m - 1] = (long) rides[m - 1][0] + rides[m - 1][1];

    for (int i = m - 2; i >= 0; i--) {
        suffMinOpenDur[i] = Math.min(
            suffMinOpenDur[i + 1],
            (long) rides[i][0] + rides[i][1]
        );
    }

    long ans = Long.MAX_VALUE;

    for (int i = 0; i < firstStart.length; i++) {

        long finish = (long) firstStart[i] + firstDur[i];

        int pos = upperBound(starts, (int) finish);

        if (pos > 0) {
            ans = Math.min(ans, finish + prefMinDur[pos - 1]);
        }

        if (pos < m) {
            ans = Math.min(ans, suffMinOpenDur[pos]);
        }
    }

    return ans;
}

private int upperBound(int[] arr, int target) {

    int l = 0;
    int r = arr.length;

    while (l < r) {

        int mid = l + (r - l) / 2;

        if (arr[mid] <= target) {
            l = mid + 1;
        } else {
            r = mid;
        }
    }

    return l;
}
    }

/*  int finished=Integer.MAX_VALUE;
          int waterTime=0;
         int wait1=0;
         int Result2=Integer.MAX_VALUE;
           int landTime=0;
         int wait=0;
         int Result1=Integer.MAX_VALUE;
         
       for(int i=0;i<landStartTime.length;i++){
        for(int j=0;j<waterStartTime.length;j++){

        //land-->water
      
        landTime=landStartTime[i]+landDuration[i];
        if(waterStartTime[j]>landTime){
           wait=waterStartTime[j]-landTime;
          landTime+=wait;
        }
        landTime+=waterDuration[j];
        if(landTime<Result1){
            Result1=landTime;
        }


        //water--->land
        
        waterTime=waterStartTime[j]+waterDuration[j];
        if(landStartTime[i]>waterTime){
           wait1=landStartTime[i]-waterTime;
          waterTime+=wait1;
        }
        waterTime+=landDuration[i];
        if(waterTime<Result2){
            Result2=waterTime;
        }
        

        }

        
       } 
        finished=Math.min(Result1,Result2);
       return finished;*/