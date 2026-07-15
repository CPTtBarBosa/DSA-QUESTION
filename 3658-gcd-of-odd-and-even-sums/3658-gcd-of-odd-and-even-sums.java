class Solution {
    public static int findgscd(int a,int b){
        if(b==0){
            return Math.abs(a);
        }
        return findgscd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=n;i++){
            oddsum+=2*i-1;
            evensum+=2*i;
        }
        int gcd=findgscd(oddsum,evensum);
        return gcd;
        
    }
}