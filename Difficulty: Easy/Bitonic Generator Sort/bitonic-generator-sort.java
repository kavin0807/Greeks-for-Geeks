// User function Template for Java

class Solution {
    public static ArrayList<Integer> bitonicGenerator(int arr[]) {
       int n=arr.length;
       ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int i=0;
        for(int j:even){
            arr[i++]=j;
        }
        for(int j:odd){
            arr[i++]=j;
        }
       ArrayList<Integer> result = new ArrayList<>();
        for (int val : arr) {
            result.add(val);
        }
       return result;
    }
}
