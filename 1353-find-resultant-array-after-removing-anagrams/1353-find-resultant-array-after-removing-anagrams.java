class Solution {
    public static boolean isanagram(String a,String b){
       
        if(a.length() != b.length()){
            return false;
        }
        Map<Character,Integer> a1=new HashMap<>();
        Map<Character,Integer> b1=new HashMap<>();
        for(int i=0;i<a.length();i++){
            a1.put(a.charAt(i),a1.getOrDefault(a.charAt(i),0)+1);
            b1.put(b.charAt(i),b1.getOrDefault(b.charAt(i),0)+1);
        }
        return a1.equals(b1);
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> n=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            n.add(words[i]);
        }
        if(n.size()<=2 ){
            return n;
        }
        for(int j=1;j<n.size();j++){
            String w1=n.get(j);
            String n2=n.get(j-1);
            if(isanagram(w1,n2)){
                n.remove(w1);
                j--;
            }
        }
        return n;
    }
}