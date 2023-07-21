class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();char k=97;
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)!=' ')
            { char x=key.charAt(i);
                char ch=(char)k;
                if(!map.containsKey(x))
                    {map.put(x,k);
                    k++;}
                }
        }
        String res="";String word="";
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            {
                res=res+word+" ";
                word="";
            }
            else
            {
                word=word+map.get(message.charAt(i));
            }
        }
        res+=word;
        return res;
    }
}