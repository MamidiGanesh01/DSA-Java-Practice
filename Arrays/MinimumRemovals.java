/*
Problem: Minimum Removals to Make Array k-Valid (LeetCode)
Approach: Sorting + Two Pointers
Time Complexity: O(n log n)
Space Complexity: O(1)
*/

class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);

        int i = 0, j = 0;
        int m = 0;

        while (j < nums.length) {
            if ((long) nums[i] * k >= nums[j]) {
                m = Math.max(m, j - i + 1);
                j++;
            } else {
                i++;
            }
        }
        return nums.length - m;
    }
}
