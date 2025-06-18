class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int i=0;
      Arrays.sort(arr);
        for(int j=n-2;j>=0;j--){
            if(arr[j]!=arr[n-1]){
                 return arr[j];
            }
        }
        return -1;
    }
}