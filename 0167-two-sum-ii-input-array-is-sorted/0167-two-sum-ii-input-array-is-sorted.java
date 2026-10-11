class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] len=new int[2];
        int i=0;
        int j=numbers.length-1;

        while(i<numbers.length && j<numbers.length){
            if(numbers[i]+numbers[j]==target){
                len[0]=i+1;
                len[1]=j+1;
                return len;
            }else if(numbers[i]+numbers[j]>target){
                j--;
            }else{
                i++;
            }
            
        }
        return len;
    }
}