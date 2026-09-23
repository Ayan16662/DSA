class Solution {
    public int sumOfUnique(int[] nums) {
        // map unique wlement 
    
        Map<Integer, Integer> map = new HashMap<>();
            int ans = 0;
        for(int i  = 0; i<nums.length; i++){
            // freq 
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==1)  ans+= nums[i];
            if(map.get(nums[i])==2)  ans-=nums[i];
        }

        return ans;

    }
}