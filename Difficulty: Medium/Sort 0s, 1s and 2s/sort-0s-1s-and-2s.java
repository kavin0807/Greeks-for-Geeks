class Solution {
    public void sort012(int[] arr) {
       int count0=0,count1=0,count2=0;
       for(int i:arr){
           if(i==0) count0++;
           else if(i==1) count1++;
           else count2++;
       }
       int idx=0;
       while(count0-->0) arr[idx++]=0;
       while(count1-->0) arr[idx++]=1;
       while(count2-->0) arr[idx++]=2;
    }
}