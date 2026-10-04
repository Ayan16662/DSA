class Solution {
    public int majorityElement(int[] nums) {
        // boye mohre algo 
       int PW = nums[0];
       int voting = 1;
       for(int i = 1; i<nums.length; i++){
        if(nums[i]== PW) voting ++;
        else voting --;
        if(voting == 0){
            PW = nums[i];
            voting =1;
        }

       }
       return PW;
        
    }
}