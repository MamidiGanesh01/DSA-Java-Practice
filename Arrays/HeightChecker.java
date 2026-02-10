/*
Problem: Height Checker 
Approach: Sorting (Bubble Sort) + Comparison
Time Complexity: O(n^2)
Space Complexity: O(n)
*/

class Solution {

    // Bubble sort implementation
    private void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int heightChecker(int[] heights) {
        int[] sortedHeights = heights.clone();
        bubbleSort(sortedHeights);

        int count = 0;
        for (int i = 0; i < sortedHeights.length; ++i) {
            if (heights[i] != sortedHeights[i]) {
                count++;
            }
        }
        return count;
    }
}
