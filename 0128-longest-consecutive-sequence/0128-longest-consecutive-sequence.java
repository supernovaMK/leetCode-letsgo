class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int maxLength =1;
        int nowCount =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1){
                nowCount ++;
            }else{nowCount=1;}

            maxLength = Math.max(maxLength,nowCount);            
        }
        return maxLength;
    }
}