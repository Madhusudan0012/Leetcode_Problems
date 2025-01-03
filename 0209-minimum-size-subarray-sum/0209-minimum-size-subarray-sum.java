class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;
        for(int j = 0; j<nums.length ; j++){
            sum+=nums[j];


            while(sum>=target){
                minlength = Math.min(minlength , j-i+1);
                sum-=nums[i];
                i++;

            }
        }
        return minlength == Integer.MAX_VALUE ?0: minlength;
        
    }
}