class Solution {
    public  static int findgcd(int a, int b){
        if(b==0){
            return Math.abs(a);
        }
        return findgcd(b,a%b);
    }
    public boolean isReachable(int targetX, int targetY) {
        int result=findgcd(targetX,targetY);
        if((result > 0 && (result & (result - 1)) == 0)){
            return true;
        }
        else{
            return false;
        }
    }
}