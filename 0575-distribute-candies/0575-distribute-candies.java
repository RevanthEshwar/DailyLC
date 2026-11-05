class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int len=candyType.length;
        for(int i=0;i<len;i++){
            set.add(candyType[i]);
        }
        int si=set.size();
        int re=0;
        if(si>=len/2){
            return len/2;
        }else{
            return si;
        }
    }
}