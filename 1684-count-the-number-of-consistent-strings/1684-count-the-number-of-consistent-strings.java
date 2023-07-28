class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;int flag=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
           { if(allowed.contains(Character.toString(words[i].charAt(j))))
            {
               flag++;
            }
           
           }
            if(flag==words[i].length())
               { c++;}
            flag=0;
        }
        return c;
    }
}