class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> container = new HashSet<>();
        for(int num : nums){
            container.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1 ; i<= nums.length ; i++){
            if(!container.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}