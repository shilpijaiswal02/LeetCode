class Solution {
    public boolean checkValid(int[][] matrix) {

        //row
        for(int i=0;i<matrix.length;i++){
          HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<matrix.length;j++){
                set.add(matrix[i][j]);
            }
            if(set.size()!=matrix.length){
                return false;
            }

            set.clear();
        }
           for(int j = 0; j < matrix[0].length; j++) {

            HashSet<Integer> set = new HashSet<>();

            for(int i = 0; i < matrix.length; i++) {
                set.add(matrix[i][j]);
            }

            if(set.size() != matrix.length) {
                return false;
            }
        }


        return true;
    }
}