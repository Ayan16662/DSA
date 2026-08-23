class Solution {
    public int minimumSwaps(int[] nums) {

        int i = 0; int j = nums.length-1;  int ans = 0;
        while(i<j){
            if(nums[j]==0){
                j--;
            }
            else if (nums[i]==0 && nums[j]!=0){
                ans++;
                i++;
                j--;
            }
            else i++;
        }
        return ans;
        
    }
}