class Solution {
    public long countCommas(long n) {
        long nal=n;
        long res=0;
        long st=1;
        while(st<=nal){
            long end=Math.min(st*10-1,nal);
            int di=String.valueOf(st).length();
            int co=(di-1)/3;
            if(co>0){
                res=res+(end-st+1)*co;
            }
            st=st*10;
        }
        return res;
    }
}