class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int current = 0;
        int two = nums.length-1;

        while (current <= two) {
            if (nums[current] == 0) {
                nums[current] = nums[zero];
                nums[zero] = 0;
                zero++;
                current++;
            } else if (nums[current] == 2) {
                nums[current] = nums[two];
                nums[two] = 2;
                two--;
            }else{current++;}
        }
    }
}