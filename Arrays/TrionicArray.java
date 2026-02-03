/*
Problem: Trionic Array Check (LeetCode)
Approach: Three-phase traversal
          1) Strictly increasing
          2) Strictly decreasing
          3) Strictly increasing
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        // First increasing part
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Decreasing part
        int p = i;
        while (p + 1 < n && nums[p] > nums[p + 1]) {
            p++;
        }
        if (p == i || p == n - 1) {
            return false;
        }

        // Final increasing part
        int q = p;
        while (q + 1 < n && nums[q] < nums[q + 1]) {
            q++;
        }

        return q == n - 1;
    }
}
