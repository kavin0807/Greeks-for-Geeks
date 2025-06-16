class Solution {
    public static String encode(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                res.append(s.charAt(i)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        res.append(s.charAt(n - 1)).append(count);

        return res.toString();
    }
}
