class Solution {
    int maxProduct(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            // top 3 max
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // bottom 2 min
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        long prod1 = 1L * max1 * max2 * max3;
        long prod2 = 1L * max1 * min1 * min2;

        return (int)Math.max(prod1, prod2);
    }
}
