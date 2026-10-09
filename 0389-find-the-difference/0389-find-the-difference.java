class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        int len1=s.length();
        for(int i=0;i<len1;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int len2=t.length();
        for(int i=0;i<len2;i++){
            if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i))==0){
                return t.charAt(i);
            }
            map.put(t.charAt(i),map.get(t.charAt(i))-1);
        }
        return ' ';

    }
}