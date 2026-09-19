class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int clox=Math.max(x1,Math.min(xCenter,x2));
        int cloy=Math.max(y1,Math.min(yCenter,y2));

        int dist1=xCenter-clox;
        int dist2=yCenter-cloy;

        int res=(int)Math.sqrt((dist1*dist1)+(dist2*dist2));
        if(res<=radius){
            return true;
        }
        return false;
    }
}