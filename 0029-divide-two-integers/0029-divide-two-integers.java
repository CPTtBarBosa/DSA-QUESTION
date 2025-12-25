
class Solution {
    public int divide(int dividend, int divisor) {
        int di=dividend/divisor;
        
        // 
        if (dividend == -2147483648 && divisor == -1){
            return 2147483647;
        }
        else{
            return di;
        }
    }
}