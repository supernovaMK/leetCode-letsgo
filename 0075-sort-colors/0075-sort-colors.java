class Solution {
    public void sortColors(int[] nums) {
        int left =0 ;
        int right = nums.length -1 ;
        while(left<right){
            if(nums[left]==2 && nums[right]==0){
                nums[left]=0;
                nums[right]=2;
                left++;
                right--;
            }else if(nums[left]==2){
                right--;
            }else{left++;}
        }

        left = 0 ;
        right = nums.length -1 ;
        while(left<right){
            if(nums[left]==2 && nums[right]==1){
                nums[left]=1;
                nums[right]=2;
                left++;
                right--;
            }else if(nums[left]==2){
                right--;
            }else{left++;}
        }

        left = 0 ;
        right = nums.length -1 ;
        while(left<right){
            if(nums[left]==1 && nums[right]==0){
                nums[left]=0;
                nums[right]=1;
                left++;
                right--;
            }else if(nums[left]==1){
                right--;
            }else{left++;}
        }
    
    }
}