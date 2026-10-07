class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int prefix=0;
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            int need=prefix-goal;
            if(map.containsKey(need)){
                cnt=cnt+map.get(need);

            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return cnt;
    }
}