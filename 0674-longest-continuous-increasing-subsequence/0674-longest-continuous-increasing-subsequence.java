class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int sum=1;
        int ans=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum++;
                ans=Math.max(ans,sum);
            }
            else{
                sum=1;
            }
        }
        return ans;
    }
}