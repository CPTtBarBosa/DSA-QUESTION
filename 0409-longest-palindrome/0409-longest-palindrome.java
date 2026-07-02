class Solution {
    public int longestPalindrome(String s) {
         int result=0;
         
        HashMap<Character,Integer> n1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            n1.put(s.charAt(i), n1.getOrDefault(s.charAt(i),0)+1);
        }
        int max1= 0;
        int count=0;
        for(int i:n1.values()){
            if(i%2==0){
                result+=i;
            }
            else if(i%2!=0){
                result+=i-1;
                count++;
                
            }

        }
        if(count>=1){
        return result+1;
        }
        return result;
    }
}