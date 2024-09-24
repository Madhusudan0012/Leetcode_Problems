class Solution {
    public int[] replaceElements(int[] arr) {
        // Initialize the max with the last element in the array
        int max = arr[arr.length - 1];
        // Set the last element to -1 as per the problem statement
        arr[arr.length - 1] = -1;

        // Traverse the array from second last element to the first
        for (int i = arr.length - 2; i >= 0; i--) {
            // Temporarily store the current element before we overwrite it
            int temp = arr[i];
            // Replace the current element with the max value found so far
            arr[i] = max;
            // Update the max to be the maximum of the current max and temp (the original value of arr[i])
            max = Math.max(max, temp);
        }

        return arr;
    }
}
