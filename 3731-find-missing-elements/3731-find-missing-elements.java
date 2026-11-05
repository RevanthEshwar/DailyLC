class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        //Arrays.sort(nums);
        int min=100,max=1;
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }if(nums[i]>max){
                max=nums[i];
            }
            set.add(nums[i]);
        }

        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
       
        return list;
    }
}