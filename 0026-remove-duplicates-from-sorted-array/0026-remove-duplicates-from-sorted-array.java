class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int uniquenumber = 1;
        
        if(n==0) return 0;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[uniquenumber] = nums[i];
                uniquenumber++;

            }
        }
        return uniquenumber;
    }
}