class Solution {
    public int firstMatchingIndex(String s) {
        int leftpt=0;
        int rigthpt=s.length()-1;
        int index=-1;
        int smallestindex=Integer.MAX_VALUE;
        while(leftpt<=rigthpt){
            if(s.charAt(leftpt)==s.charAt(rigthpt)){
                index=leftpt;
                smallestindex=Math.min(smallestindex,index);
            
            }
            
            leftpt++;
            rigthpt--;

        }
        if(smallestindex==Integer.MAX_VALUE){
            return -1;
        }
        else{
         return smallestindex;
        }
        
    }
}