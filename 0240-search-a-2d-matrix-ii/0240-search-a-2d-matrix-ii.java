class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=m-1;
        while(j>=0 && i<n){
            int ptr=matrix[i][j];
            if(ptr==target){
                return true;
            }else if(ptr>target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}