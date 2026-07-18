class Solution {
    public int smallestEvenMultiple(int n) {
        int smal1=(n*2);
        int div;
        if(n%2==0){
             div=n/2;
        }
        else{
            return smal1;
        }
        int min=Math.min(smal1,div*2);
        return min;

    }
}