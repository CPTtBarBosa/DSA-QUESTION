class Solution {
    public boolean isFascinating(int n) {
        boolean isfasc=true;
        int n2=n*2;
        int n3=n*3;
        String b=String.valueOf(n);
        String c=String.valueOf(n2);
        String d=String.valueOf(n3);
        String conct=b+c+d;
        HashMap<Character,Integer> n4=new HashMap<>();
        for(int i=0;i<conct.length();i++){
            if(conct.charAt(i)=='0'){
                isfasc=false;
                break;
            }
            n4.put(conct.charAt(i),n4.getOrDefault(conct.charAt(i),0)+1);
           
            
        }
        if(isfasc!=false){
            for(int k:n4.values()){
                if(k>1){
                    isfasc=false;
                    break;
                }
            }
        }
        return isfasc;
        
    }
}