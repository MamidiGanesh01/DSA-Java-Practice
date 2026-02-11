/*
Problem: Majority Element (LeetCode)
Approach: HashMap Frequency Counting
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int ans = 0;
        int maximum = 0;

        for (Integer val : map.keySet()) {
            if (map.get(val) > maximum) {
                maximum = map.get(val);
                ans = val;
            }
        }

        return ans;
    }
}
