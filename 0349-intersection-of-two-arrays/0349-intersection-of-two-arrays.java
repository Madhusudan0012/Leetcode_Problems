class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //intersection of two array
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int N = nums1.length;
        int M = nums2.length;
        int P1 = 0;
        int P2 = 0;
        Set<Integer> intersection= new HashSet<>();
        while(P1 <N && P2 < M){
            if(nums1[P1] == nums2[P2]){
                intersection.add(nums1[P1]);
                P1++;
                P2++;
            }
            else if(nums1[P1] < nums2[P2]){
                P1++;
            }else{
                P2++;
            }
        }
        int K  = intersection.size();
        int[] result = new int[K];
        int curr = 0;
        for(int x : intersection){
            result[curr++] =x;
        }
        return result;


    }
}