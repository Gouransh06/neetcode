class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int j = nums.length - 1;
        int n = nums.length;
        for(int i = 0; i < n; i++){

            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                n--;
                i--;
                continue;
            }

            if(nums[i] != val){
                k++;
            }
            
        }
        return k;
    }
}