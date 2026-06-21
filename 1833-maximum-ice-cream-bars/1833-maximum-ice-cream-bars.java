class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int totalcost=0;
        int count=0;
        for(int i=0;i<costs.length;i++){
            totalcost+=costs[i];
            if(totalcost<=coins){
                count++;
            }
            else {
                break;
            }
        }
        return count;
        
    }
}