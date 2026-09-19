class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int le=0;
        int ri=len-1;
        int max=0;
        int l=0,b=0;
        while(le<ri){
            l=ri-le;
            b=Math.min(height[le],height[ri]);
            max=Math.max(max,l*b);

            if(height[le]<height[ri]){
                le++;
            }
            else{
                ri--;
            }
        }

        return max;


    }
}