class Solution {
    public boolean isValid(String s) {
        Stack<Character> pocket=new Stack<>();
       
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                pocket.push(s.charAt(i));
            }
            else{
             if(pocket.isEmpty()){
                return false;
             }
            else if(s.charAt(i)==')' && pocket.peek()=='(' || s.charAt(i)=='}' && pocket.peek()=='{' || s.charAt(i)==']' && pocket.peek()=='['){
                pocket.pop();
            }
        
        else{
            return false;
        }
        }
        }
        return pocket.isEmpty();
    }
}