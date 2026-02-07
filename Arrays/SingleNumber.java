/*
Problem: Single Number (LeetCode)
Approach: Bit Manipulation using XOR
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;

        for (int n : nums) {
            res ^= n;
        }
        return res;
    }
}
