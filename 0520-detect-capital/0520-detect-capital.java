class Solution {
    public boolean detectCapitalUse(String word) {
        int len=word.length();
        int up=0;
        int lo=0;

        for(int i=0;i<len;i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                up++;
            }else {
                lo++;
            }
        }
        char ch1=word.charAt(0);
        if(up==len || lo==len){
            return true;
        }else if((ch1>='A' && ch1<='Z') && lo==len-1){
            return true;
        }
        return false;
    }
}