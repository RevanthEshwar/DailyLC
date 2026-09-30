class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
                ans=Math.max(ans,sum);
            }else{
                sum=0;
            }
        }
        return ans;
    }
}