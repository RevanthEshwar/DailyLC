class Solution {
    public int[] runningSum(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=sum;
            sum=sum+nums[i];

        }
        nums[nums.length-1]=sum;
        return nums;
    }
}