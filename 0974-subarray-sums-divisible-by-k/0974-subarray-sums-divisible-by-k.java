class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int cnt=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum=sum+nums[j];
        //         if(sum%k==0){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;

        int prefix=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int needed=((prefix%k)+k)%k;
            if(map.containsKey(needed)){
                cnt+=map.get(needed);
            }
            map.put(needed,map.getOrDefault(needed,0)+1);
        }
        return cnt;
    }
}