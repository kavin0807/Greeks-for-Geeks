// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        int n=s.length();
        String r="";
        for(int i=n-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return r;
    }
}