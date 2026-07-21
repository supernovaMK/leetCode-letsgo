class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {
                
                if (nums[left] + nums[right] == -nums[i]) {
                    answer.add(List.of(nums[i], nums[left], nums[right]));

                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }

                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    right--;
                    left++;
                    continue;
                }

                if (nums[left] + nums[right] < -nums[i]) {
                    left++;
                } else {
                    right--;
                }
            }
           
        } return answer;
    }
}