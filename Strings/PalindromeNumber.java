/*
Problem: Palindrome Number (LeetCode)
Approach: Convert Integer to String + Two Pointers
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);
        char[] arr = str.toCharArray();

        int l = 0;
        int h = arr.length - 1;

        while (l < h) {
            if (arr[l] != arr[h]) {
                return false;
            }
            l++;
            h--;
        }

        return true;
    }
}
