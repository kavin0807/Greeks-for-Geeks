class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i != index) { 
                    arr[index] = arr[i];
                    arr[i] = 0; 
                }
                index++;
            }
        }
    }
}
