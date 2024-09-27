class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> Map = new HashSet<>();
        for(int num : nums){
            Map.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1 ; i<=nums.length ; i++){
            if(!Map.contains(i)){
                ans.add(i);
            }

        }
        return ans;



    }
}