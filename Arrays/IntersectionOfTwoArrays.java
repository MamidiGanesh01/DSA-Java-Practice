/*
Problem: Intersection of Two Arrays (LeetCode)
Approach: Sorting + Two Pointers + HashSet
Time Complexity: O(n log n + m log m)
Space Complexity: O(n + m)
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int N = nums1.length;
        int M = nums2.length;
        int p1 = 0, p2 = 0;

        // Set to store unique intersection elements
        Set<Integer> intersection = new HashSet<>();

        // Two-pointer traversal
        while (p1 < N && p2 < M) {
            if (nums1[p1] == nums2[p2]) {
                intersection.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        // Convert set to array
        int[] result = new int[intersection.size()];
        int idx = 0;
        for (int x : intersection) {
            result[idx++] = x;
        }

        return result;
    }
}
