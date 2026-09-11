class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int medi=nums[nums.length/2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=medi){
                sum=sum+Math.abs(medi-nums[i]);
            }
        }
        return sum;
    }
}