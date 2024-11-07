class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cntZeroes = 0;
        long ans =0;
        for(int i = 0  ; i<nums.length ; i++){
            if(nums[i] == 0) {
                cntZeroes++;
            }
            else{
                cntZeroes = 0;
            }
            ans += cntZeroes;

        }
        return ans;
        
    }
}