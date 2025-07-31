class Solution {
    public boolean isAnagram(String s, String t) {
        boolean n=false;
        if(s.length() != t.length()){
            return n;
        }
        Map<Character,Integer> s1=new HashMap<>();
        Map<Character,Integer> t1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
            t1.put(t.charAt(i),t1.getOrDefault(t.charAt(i),0)+1);
        }
        if(s1.equals(t1)){
            n=true;
        }
        return n;
    }
}