class Solution {
    public boolean isValid(String s) {
     Stack<Character> s1=new Stack<>();
     for(char c:s.toCharArray()){
        if(c=='(' || c== '{'  || c=='['){
            s1.push(c);

        }
        else{
            if(s1.isEmpty()){
                return false;
            }
            char top=s1.pop();
            if(c==')' && top !='('){
                return false;
            }
            else if(c=='}' && top!='{'){
                return false;
            }
            else if(c==']' && top!='[' ){
                return false;
            }
        }
     }
     return s1.isEmpty();
    }
}