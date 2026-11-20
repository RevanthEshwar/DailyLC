class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int x:nums){
            
            if(set.contains(x)){
                set.remove(x);
            }else{
                set.add(x);
            }
        }

        int arr[]=new int[set.size()];
        int i=0;
        for(int x:set){
            arr[i++]=x;
        }
        return arr;
    }
}