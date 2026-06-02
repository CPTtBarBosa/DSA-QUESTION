class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int mincost=0;
       for(int i=cost.length-1;i>=0;i=i-3){
        mincost+=cost[i];
        if(i-1>=0){
            mincost+=cost[i-1];
        }
       }
        return mincost;
    }
}