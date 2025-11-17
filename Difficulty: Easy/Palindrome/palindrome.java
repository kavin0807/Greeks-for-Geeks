class Solution {
    public boolean isPalindrome(int n) {
        if(n<0 || n%10==0 && n!=0){
            return false;
        }
        int rev=0;
        int org=n;
        while(n!=0){
            int tem=n%10;
            rev=rev*10+tem;
            n=n/10;
        }
        
        return org==rev;
    }
}