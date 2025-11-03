class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        if(strs.length == 0){
            return new ArrayList();
        }
        HashMap<String,List<String>> newmap=new HashMap<>();
        int[] count=new int[26];
        for(String c:strs){
            Arrays.fill(count,0);
        
        for(char sq:c.toCharArray()){
            count[sq-'a']++;


        }
        
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<26;i++){
            s.append("#");
            s.append(count[i]);
        }
        String key=s.toString();
        if(!newmap.containsKey(key)){
            newmap.put(key,new ArrayList());
        }
        newmap.get(key).add(c);
    }
    return new ArrayList(newmap.values());
}
}