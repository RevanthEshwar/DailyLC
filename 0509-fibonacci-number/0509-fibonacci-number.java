class Solution {
    public int fib(int n) {
        int fir=0,sec=1,sum=0;
        if (n==0 || n==1){
            return n;
        }
        else{
            for(int i=0;i<n;i++){
                fir=sec;
                sec=sum;
                sum=fir+sec;
            }
        }
        return sum;
    }
}