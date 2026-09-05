class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len=nums.length;
        int pm[]=new int[len];
        int sm[]=new int[len];
        pm[0]=nums[0];
        for(int i=1;i<len;i++){
            if(pm[i-1]>=nums[i]){
                pm[i]=pm[i-1];
            }else{
                pm[i]=nums[i];
            }
        }
        sm[len-1]=nums[len-1];
        for(int i=len-2;i>=0;i--){
            if(sm[i+1]<=nums[i]){
                sm[i]=sm[i+1];
            }else{
                sm[i]=nums[i];
            }
        }

        for(int i=0;i<len;i++){
            if(pm[i]-sm[i]<=k){
                return i;
            }
        }
        return -1;
    }
}