class Solution {
    public int maxArea(int[] height) {
          int i=0;
          int j=height.length-1;
          int area=Integer.MIN_VALUE;
    
          while(i<j && j<height.length){
              int indexdiff=Math.abs(i-j);
              int AreaSum=Math.min(height[i],height[j])*indexdiff;
              if(AreaSum>area){
                area=AreaSum;
              }
              if(height[i]<height[j])i++;
              else j--;
          }
          return area;
    }
    
}