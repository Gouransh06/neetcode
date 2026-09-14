class Solution {
    public int trap(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int area = 0;

        while (left < right) {
            if (nums[left] < nums[right]) {
                if (nums[left] >= leftmax) {
                    leftmax = nums[left];
                } else {
                    area += leftmax - nums[left];
                }
                left++;
            } else {
                if(nums[right] >= rightmax){
                    rightmax = nums[right];
                }else{
                    area += rightmax - nums[right];
                }
                right--;
            }
        }
        return area;
    }
}
