class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1) return 0;
        int TotalSum = 0;
        for(int i = 0;i<nums.length ; i++){
            TotalSum += nums[i];
        }
        int leftTotal = 0;
        for(int i = 0 ; i<nums.length ; i++){
            int rightTotal = TotalSum - leftTotal - nums[i];
            if(rightTotal == leftTotal){
                return i;
            }
            leftTotal+=nums[i];
        }
        return -1;
    }
}