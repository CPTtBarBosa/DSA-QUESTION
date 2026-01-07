/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Long> allSums = new ArrayList<>();
    public int maxProduct(TreeNode root) {
        //private List<Long> allSums = new ArrayList<>();

    
        long totalSum = calculateSubtreeSums(root);
        long maxProd = 0;

        for (long sum : allSums) {
            long currentProd = sum * (totalSum - sum);
            maxProd = Math.max(maxProd, currentProd);
        }

        return (int) (maxProd % 1000000007);
    }

    private long calculateSubtreeSums(TreeNode node) {
        if (node == null) return 0;

        long currentSubtreeSum = node.val 
                               + calculateSubtreeSums(node.left) 
                               + calculateSubtreeSums(node.right);
        
        allSums.add(currentSubtreeSum);
        return currentSubtreeSum;
    }
}