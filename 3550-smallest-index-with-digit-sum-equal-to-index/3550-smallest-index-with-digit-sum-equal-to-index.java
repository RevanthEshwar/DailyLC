class Solution {
    int sumof(int n){
        int sum=0;
        while(n>0){
            int rev=n%10;
            sum=sum+rev;
            n=n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int len=nums.length;
        boolean fou=false;
        int ind=-1;
        for(int i=0;i<len;i++){
            int ans=sumof(nums[i]);
            if(ans==i){
                fou=true;
                ind=i;
                break;
            }
        }
        return ind;
    }
}