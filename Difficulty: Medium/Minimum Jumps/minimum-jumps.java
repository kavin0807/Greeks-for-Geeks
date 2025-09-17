class Solution {
    public int minJumps(int[] arr) {
       int n=arr.length;
       int max=0;
       int choice=0;
       int ans=0;
       for(int i=0;i<n-1;i++){
           max=Math.max(max,arr[i]+i);
           if(i==choice){
               choice=max;
               ans++;
           }
       }
       if(choice>=n-1){
           return ans;
       }
       return -1;
    }
}