class Solution {
    public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    int kthLargest=nums[nums.length-k];
    return kthLargest;
    }
}