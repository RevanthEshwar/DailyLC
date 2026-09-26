class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(nums[i]*nums[i]);
        }
        int dup[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                dup[i]=Math.abs(nums[i]);
            }else{
                dup[i]=nums[i];
            }
        }
        Arrays.sort(dup);
        int minl=nums.length/2;

        long mins=0;
        for(int i=0;i<minl;i++){
            mins+=(dup[i]*dup[i]);
        }

        return sum-(mins+mins);
        
    }
}