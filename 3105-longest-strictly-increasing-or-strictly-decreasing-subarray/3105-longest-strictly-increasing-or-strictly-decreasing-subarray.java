class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int len=nums.length;
        int minto=1;
        int maxto=1;
        int tot=1;
        int sum=1;
        for(int i=1;i<len;i++){
            if(nums[i-1]>nums[i]){
                tot++;
                maxto=Math.max(maxto,tot);
            }else{
                tot=1;
            }
        }

        for(int i=1;i<len;i++){
            if(nums[i-1]<nums[i]){
                sum++;
                minto=Math.max(minto,sum);
            }else{
                sum=1;
            }
        }
        return Math.max(minto,maxto);
    }
}