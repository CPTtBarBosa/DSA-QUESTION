class Solution {
    public boolean isPalindrome(String s) {
        boolean isplaindrome=false;
        int left=0;
         s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int rigth=s.length()-1;
        if(s.length()<= 1){
            isplaindrome=true;
        }
        while(left<rigth){
            if(s.charAt(left) == s.charAt(rigth)){
                isplaindrome=true;
                left++;
                rigth--;
            
               
            }
            else{
                isplaindrome=false;
                break;
            }
           
            
        }
       
    
     return isplaindrome;
    }
}
