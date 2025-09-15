class Solution {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) return s;

        String[] words = s.split("\\.");
        StringBuilder rev = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {   
                rev.append(words[i]);
                if (i > 0) rev.append(".");
            }
        }
        if (rev.length() > 0 && rev.charAt(rev.length() - 1) == '.') {
            rev.deleteCharAt(rev.length() - 1);
        }

        return rev.toString();
    }
}
