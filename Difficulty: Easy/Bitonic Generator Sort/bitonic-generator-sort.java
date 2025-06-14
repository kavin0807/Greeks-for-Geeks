// User function Template for Java

import java.util.*;

class Solution {
    public static ArrayList<Integer> bitonicGenerator(int arr[]) {
        int n = arr.length;

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Step 1: Separate even and odd index elements
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        // Step 2: Sort
        Collections.sort(even); // ascending
        Collections.sort(odd, Collections.reverseOrder()); // descending

        // Step 3: Merge back into arr
        int i = 0;
        for (int j : even) {
            arr[i++] = j;
        }
        for (int j : odd) {
            arr[i++] = j;
        }

        // Step 4: Build and return the result as ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        for (int val : arr) {
            result.add(val);
        }

        return result;
    }
}
