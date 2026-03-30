class Solution {
    public boolean checkStrings(String s1, String s2) {
       int[] freq1=new int[52];
        boolean canweswap=true;

        for(int i=0;i<s1.length();i++){
            int res= 26*(i%2)+(s1.charAt(i)-'a');
            int res1= 26*(i%2)+(s2.charAt(i)-'a');
            freq1[res]++;
            freq1[res1]--;
        }
        for(int count:freq1){
            if(count!=0){
                canweswap=false;
            }
        }
        return canweswap;
    }
}