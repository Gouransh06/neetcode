class Solution {
    public void rotate(int[] nums, int k) {
        
        while(k > 0){

            for(int i = nums.length - 1; i > 0; i--){
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
            k--;

        }
    }
}