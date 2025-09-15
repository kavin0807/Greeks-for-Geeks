class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        
       Map<Character,Integer> map1=new HashMap<>();
       Map<Character,Integer> map2=new HashMap<>();
       
       for(char c:s1.toCharArray()){
           map1.put(c,map1.getOrDefault(c,0)+1);
       }
       for(char s:s2.toCharArray()){
           map2.put(s,map2.getOrDefault(s,0)+1);
       }
       return map1.equals(map2);
        
    }
}