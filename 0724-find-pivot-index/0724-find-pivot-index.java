class Solution {
    public int pivotIndex(int[] nums) {
        int TotalSum = 0;
        for(int num : nums){
            TotalSum += num;
        }
        int leftSum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            int rightSum = TotalSum - leftSum - nums[i];
            if(rightSum == leftSum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}