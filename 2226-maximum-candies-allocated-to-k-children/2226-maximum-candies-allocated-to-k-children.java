class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,candies[i]);
        }
        long res=0;
        long low=1;
        long high=max;
        while(low<=high){
            long mid=(low+high)/2;


            long cnt=0;

            for(int i=0;i<n;i++){
                cnt+=candies[i]/mid;
            }
            if(cnt>=k){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)res;
    }
}