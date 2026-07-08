class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        StringBuilder n1=new StringBuilder();
        long sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                sum+=Long.parseLong(String.valueOf(s.charAt(i)));
                n1.append(s.charAt(i));
            }
        }
        if(n1.length()==0){
            return 0;
        }
        else{
        long output=Long.parseLong(n1.toString())*sum;
        
        return output;
        }
    
        
    }
}