class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;

        // Handle edge cases
        if (n == 1) return 0; // Only one element
        if (arr[0] >= arr[1]) return 0; // First element is peak
        if (arr[n-1] >= arr[n-2]) return n-1; // Last element is peak

        // Check middle elements
        for (int i = 1; i < n-1; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                return i;
            }
        }

        return -1; // should not reach here if input is valid
    }
}
