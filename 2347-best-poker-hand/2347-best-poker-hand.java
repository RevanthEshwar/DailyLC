class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int cnta=0,cntb=0,cntc=0,cntd=0;
        int max=0;
        int inx=0;

        int[] freq=new int[14];
        


        for(int i=0;i<5;i++){
            freq[ranks[i]]++;
            if(suits[i]=='a'){
                cnta++;
            }else if(suits[i]=='b'){
                cntb++;
            }else if(suits[i]=='c'){
                cntc++;
            }else{
                cntd++;
            }
            
        }

        if(cnta==5 || cntb==5 || cntc==5 || cntd==5){
            return "Flush";
        }


        for(int i=0;i<=13;i++){
            if(freq[i]>=3){
                return "Three of a Kind";
            }
        }

        for(int i=0;i<=13;i++){
            if(freq[i]>=2){
                return "Pair";
            }
        }
        return "High Card";
    }
}