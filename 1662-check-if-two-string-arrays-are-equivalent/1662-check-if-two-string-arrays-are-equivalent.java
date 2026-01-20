class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder n1=new StringBuilder();
        StringBuilder n2=new StringBuilder();
        boolean isequal=false;
        for(int i=0;i<word1.length;i++){
            n1.append(word1[i]);

        }
        for(int i=0;i<word2.length;i++){
            n2.append(word2[i]);
        }
        if(n1.length()!=n2.length()){
            return false;
        }
        for(int i=0;i<n1.length();i++){
            if(n1.charAt(i)==n2.charAt(i)){
                isequal=true;
            }
            else{
                isequal=false;
                break;
            }
        }
        return isequal;
    }
}