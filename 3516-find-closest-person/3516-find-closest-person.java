class Solution {
    public int findClosest(int x, int y, int z) {
        int distancx=Math.abs(x-z);
        int distancey=Math.abs(y-z);
        int firstone=Math.min(distancx,distancey);
        if(firstone==distancx && firstone==distancey){
            return 0;
        }
        else if(firstone==distancey){
            return 2;
        }
        else{
            return 1;
        }
    }
}