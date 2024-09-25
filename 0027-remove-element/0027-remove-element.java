class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the position of the non-val elements
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Replace the element at k with nums[i]
                k++;
            }
        }
        
        return k; // The new length of the array with val removed
    }
}
