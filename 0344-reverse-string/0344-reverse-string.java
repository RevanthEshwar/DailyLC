class Solution {
    public void reverseString(char[] s) {
       int lef=0;
       int rig=s.length-1;
       while(lef<rig){
        char temp=s[lef];
        s[lef]=s[rig];
        s[rig]=temp;

        lef++;
        rig--;
       }
       
    }
}