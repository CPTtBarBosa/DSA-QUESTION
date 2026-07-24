class Solution {
    public long numberOfWeeks(int[] milestones) {
        long sum=0;
        long max=Long.MIN_VALUE;
        for(int i=0;i<milestones.length;i++){
            max=Math.max(max,milestones[i]);
            sum+=milestones[i];
        }
        long res=sum-max;
        if(max>res+1){
            return 2*res+1;
        }
        else{
            return sum;
        }
    
    }
}