class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        Set<Integer> set=new HashSet<>();
        for(Map.Entry<Character,Integer> hm:map.entrySet())
        {
            set.add(hm.getValue());
        }
        
        return set.size()==1?true:false;
    }
}