class Solution {
    public int maxProduct(int n) {
    String s=new String(String.valueOf(n));
    int product=1;
    char[] k1=s.toCharArray();
    Arrays.sort(k1);
    for(int i=k1.length-1;i>=k1.length-2;i--){
        int j=Integer.parseInt(String.valueOf(k1[i]));
        product*=j;
    }   

    return product;
    }
}