class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int sum=0;
        // for(int i=0;i<nums.size();i++){
        //     for(int j=i+1;j<nums.size();j++){
        //         if(nums.get(i)+nums.get(j)<target){
        //             sum++;
        //         }
        //     }
        // }
        // return sum;

        int i=0;
        int j=i+1;
        while(i<nums.size() && i<j){
            if(j<nums.size()){
                if(nums.get(i)+nums.get(j)<target){
                    sum++;
                    
                }
                j++;

            }else{
                i++;
                j=i+1;
            }
           
        }
        return sum;
    }
}