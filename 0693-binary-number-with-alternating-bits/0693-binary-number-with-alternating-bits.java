class Solution {
    public boolean hasAlternatingBits(int n) {
        String bits=Integer.toBinaryString(n);
        boolean hasalt=false;
        if(bits.length()<2){
            return true;
        }
        for(int i=0;i<bits.length()-1;i++){
            if((bits.charAt(i)=='0' && bits.charAt(i+1)=='1') || (bits.charAt(i)=='1' && bits.charAt(i+1)=='0')){
                hasalt=true;

            }
            else{
                hasalt=false;
                break;
            }
        }
        return hasalt;
    }
}