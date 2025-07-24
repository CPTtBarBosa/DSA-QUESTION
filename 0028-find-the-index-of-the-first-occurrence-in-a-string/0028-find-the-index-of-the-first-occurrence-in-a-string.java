class Solution {
    public int strStr(String haystack, String needle) {
        int firstindex=-1;
        if(haystack.contains(needle)){
            firstindex=haystack.indexOf(needle);
        }
        return firstindex;
        
    }
}