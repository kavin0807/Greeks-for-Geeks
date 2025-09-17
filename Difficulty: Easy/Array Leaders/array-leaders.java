import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        // Last element is always a leader
        int maxFromRight = arr[n-1];
        res.add(maxFromRight);
        
        // Traverse from right to left
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                res.add(maxFromRight);
            }
        }
        
        // Reverse result because we collected leaders from right to left
        Collections.reverse(res);
        return res;
    }
}
