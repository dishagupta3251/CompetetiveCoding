class Solution {
    public int longestSubstring(String s, int k) {
        if(k>s.length()||s.length()==0)
            return 0;
        else if(k<=1)
            return s.length();
        
        Map<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        
        int l=0;
        while(l<s.length()&&map.get(s.charAt(l))>=k)l++;
        if(l>=s.length()-1)return l;
        
        int ls1=longestSubstring(s.substring(0,l),k);
        while(l<s.length()&&map.get(s.charAt(l))<k)l++;
        int ls2=(l<s.length())?longestSubstring(s.substring(l),k):0;
        return Math.max(ls1,ls2);
    }
}