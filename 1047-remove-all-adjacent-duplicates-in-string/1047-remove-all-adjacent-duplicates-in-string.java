class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> n1=new Stack<>();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(n1.isEmpty()){
                n1.push(s.charAt(i));
            }
            else if(n1.peek()==s.charAt(i)){
                n1.pop();
            }
            else{
                n1.push(s.charAt(i));
            }
        }
        while(!n1.isEmpty()){
            s1.append(n1.peek());
            n1.pop();
        }
        String result=String.valueOf(s1.reverse());
        return result;
    }
}