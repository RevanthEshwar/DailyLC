class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot=tot+nums[i];
        }

        int ls=0;
        for(int i=0;i<nums.length;i++){
            int rs=tot-ls-nums[i];
            if(ls==rs){
                return i;
            }
            ls=ls+nums[i];
        }
        return -1;
    }
}