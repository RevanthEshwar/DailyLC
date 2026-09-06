class Solution {
    public int arrangeCoins(int n) {
        int cnt=0,i=1;
        while(n>=1){
            if(n-i<=n){
                cnt++;
            }
            i++;
            n=n-i;
        }
        return cnt;
    }
}