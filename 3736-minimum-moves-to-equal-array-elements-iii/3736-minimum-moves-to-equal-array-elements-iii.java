class Solution {
    public int minMoves(int[] nums) {
        int len=nums.length;
        int max=nums[0];
        for(int i=0;i<len;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        int tot=0;
        for(int i=0;i<len;i++){
            tot=tot+(max-nums[i]);
        }
        return tot;

    }
}