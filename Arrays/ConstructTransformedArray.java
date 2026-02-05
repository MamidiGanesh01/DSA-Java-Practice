/*
Problem: Construct Transformed Array (Circular Array)
Approach: Index transformation using modulo arithmetic
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] constructTransformedArray(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                int newIndex = (i + nums[i]) % n;

                // Handle negative index for circular array
                if (newIndex < 0) {
                    newIndex += n;
                }

                result[i] = nums[newIndex];
            }
        }

        return result;
    }
}
