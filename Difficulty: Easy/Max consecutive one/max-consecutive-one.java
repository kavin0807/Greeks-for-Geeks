class Solution {
    public int maxConsecutiveCount(int[] arr) {
        int max1 = 0;
        int max0 = 0;
        int count1 = 0;
        int count0 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
                count0 = 0; // reset 0s count
                max1 = Math.max(max1, count1);
            } else if (arr[i] == 0) {
                count0++;
                count1 = 0; // reset 1s count
                max0 = Math.max(max0, count0);
            }
        }

        return Math.max(max1, max0); // return the higher of max 1s or 0s
    }
}
