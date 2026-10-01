class Solution {
    public int heightChecker(int[] heights) {
        int[] dup=new int[heights.length];
        int n=heights.length;
        for(int i=0;i<n;i++){
            dup[i]=heights[i];
        }

        Arrays.sort(dup);
        int idx=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=dup[i]){
                idx++;
            }
        }
        return idx;
    }
}