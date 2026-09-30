class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxC = 0; int C = 0;
        for(int a : nums){
            if(a==1) C++;
            else {
                maxC = Math.max(maxC, C);
                C =0;
            }
        }
        return maxC>C?maxC:C;
    }
}