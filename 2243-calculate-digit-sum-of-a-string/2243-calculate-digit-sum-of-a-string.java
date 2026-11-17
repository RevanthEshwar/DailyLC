class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            String ans="";

            for(int i=0;i<s.length();i+=k){
                int sum=0;
                int min=Math.min(i+k,s.length());
                for(int j=i;j<min;j++){
                    sum=sum+s.charAt(j)-'0';
                }
                ans=ans+sum;
            }
            s=ans;
        }
        return s;
    }
}