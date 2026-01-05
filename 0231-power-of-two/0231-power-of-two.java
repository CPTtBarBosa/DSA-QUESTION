class Solution {
    public boolean isPowerOfTwo(int n) {
    //     if(n==1){
    //         return true;
    //     }
    //     boolean s=false;
    //     for(int i=1;i<=n;i++){
    //     int exp=(int)Math.pow(2,i);
    //     if(exp==n){
    //         s=true;
    //     }
    //     // else{
    //     //     return false;
    //     }
    // }
    return n > 0 && (n & (n - 1)) == 0;
}
}