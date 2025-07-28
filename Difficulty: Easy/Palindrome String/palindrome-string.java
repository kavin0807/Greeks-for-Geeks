class Solution {
    boolean isPalindrome(String s) {
        return check(s.toCharArray(),0,s.length()-1);
    }
    boolean check(char s[],int left,int right){
        if(left>=right) return true;
        
        if(s[left]!=s[right]) return false;
        
     return check(s, left + 1, right - 1);
}
}