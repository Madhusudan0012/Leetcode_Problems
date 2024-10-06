class Solution {
    public int[] findErrorNums(int[] nums) {
        int dul = -1;
        int missing = -1;
        for(int i = 1 ; i<=nums.length ; i++){
            int cnt = 0;
            for(int j = 0 ; j<nums.length ; j++){
                if(nums[j] == i){
                    cnt++;
                }
            }
            if(cnt == 2) {
                dul = i;
            }else if(cnt == 0 ){
                missing = i;
            }
        }
        return new int[] {dul , missing};
    }
}