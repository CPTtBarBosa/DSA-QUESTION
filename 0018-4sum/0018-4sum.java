class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
        List<List<Integer>> n=new LinkedList<>();
        long sum=0;
        int len=nums.length;
         Arrays.sort(nums);
        for(int i=0;i<len-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<len-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
            
            int left=j+1;
            int rigth=len-1;
            long tar=(long)target-nums[i]-nums[j];
            while(left<rigth){
                sum=nums[left]+nums[rigth];
                if(sum==tar){
                    
                    List<Integer> n1=Arrays.asList(nums[i],nums[j],nums[left],nums[rigth]);
                    n.add(n1);
                    left++;
                    rigth--;
                   
                    while(left<rigth && nums[left]==nums[left-1]){left++;}
                    while(left<rigth && nums[rigth]==nums[rigth+1]){rigth--;}
                    }
                
                else if(sum>tar){
                    rigth--;
                }
                else{
                    left++;
                }
            }
        }
        }
      return n;
    }
}