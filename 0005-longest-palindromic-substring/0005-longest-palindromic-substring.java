class Solution {
    public String longestPalindrome(String s) {
       if(s.length()<1){
        return s;
       } 
       int maxlen=1;
       String s1=s.substring(0,1);
       for(int i=0;i<s.length();i++){
        for(int j=i+maxlen;j<=s.length();j++){
            if(j-i>maxlen && ispalindrome(s.substring(i,j))){
                maxlen=j-i;
                s1=s.substring(i,j);
            }
        }
       }
        return s1;
    }
    private boolean ispalindrome(String str){
        int left=0;
        int rigth=str.length()-1;
        while(left<rigth){
            if(str.charAt(left)!=str.charAt(rigth)){
                return false;
            }
            left++;
            rigth--;
        }
        return true;
    }
}