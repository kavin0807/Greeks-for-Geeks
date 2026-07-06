class Solution {
    public int thirdLargest(List<Integer> arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        int n = arr.size();
        
        if(n<3){
            return -1;
        }
        
        for(int i=0;i<n;i++){
            int num = arr.get(i);
        if( num > first){
            third = second;
            second = first;
            first = num;
        }
        else if(num > second){
            third = second;
            second = num;
        }
        else if(num > third){
            third = num;
        }
    }
        return third;
    }
}