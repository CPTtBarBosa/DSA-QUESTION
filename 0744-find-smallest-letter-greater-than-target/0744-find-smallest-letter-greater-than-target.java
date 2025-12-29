class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char c=letters[0];
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                   c=letters[i];
                   break;
            }
        }
        return c;
    }
}