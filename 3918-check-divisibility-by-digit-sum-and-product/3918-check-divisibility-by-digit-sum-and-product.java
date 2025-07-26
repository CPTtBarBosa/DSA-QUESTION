class Solution {
    public boolean checkDivisibility(int n) {
        boolean is=false;
        int original=n;
        int sum=0;int product=1;
        if(n>=10){
            
        
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            product=product*rem;
            n= n/10;
        }
           // int result=sum+product;
            
            int result=sum+product;
            if (original%result ==0){
              is=true;
        }
        }
        
      
        return is;
    }
}