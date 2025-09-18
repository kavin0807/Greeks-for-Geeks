class Solution {
    int missingNum(int arr[]) {
     long n=arr.length+1;
     long sum=n*(n+1)/2;
     long ans=0;
     for(int i:arr){
         ans+=i;
     }
     return (int)(sum-ans);
    }
}