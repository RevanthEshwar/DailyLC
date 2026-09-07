class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup[]=new int[2];
        int n=nums.length;
        Arrays.sort(nums);
        int mis=1;
        int dupl=0;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i]){
                dupl=nums[i];
            }

           
            if(nums[i]==mis){
                mis++;
            }
           
        }
        dup[0]=dupl;
        dup[1]=mis;
        return dup;
    }
}