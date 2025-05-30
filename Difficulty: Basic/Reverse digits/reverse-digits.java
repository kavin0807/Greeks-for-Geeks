// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int rev =0;
        while(n!=0){
            int lastdigit=n%10;
            
            if(rev>Integer.MAX_VALUE || rev <Integer.MIN_VALUE){
                return 0;
            }
            rev=rev*10+lastdigit;
                n=n/10;
        }
        return rev;
    }
}