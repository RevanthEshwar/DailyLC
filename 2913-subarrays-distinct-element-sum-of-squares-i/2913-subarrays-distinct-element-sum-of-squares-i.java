class Solution {
    public int sumCounts(List<Integer> nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;

        for(int i=0;i<nums.size();i++){
            set.clear();
            for(int j=i;j<nums.size();j++){
                set.add(nums.get(j));
                int count=set.size();
                ans+=count*count;
            }
        }
        return ans;
    }
}