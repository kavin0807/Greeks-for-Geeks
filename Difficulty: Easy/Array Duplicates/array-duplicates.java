class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
       Set<Integer> dup=new HashSet<>();
        Set<Integer> seen = new HashSet<>();
       for(int i:arr){
           if(!seen.add(i)){
           dup.add(i);
           }
       }
       return new ArrayList<>(dup);
    }
}