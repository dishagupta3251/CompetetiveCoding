class Solution {
    
    int row1(String w,String r)
    { int r1=0;
        for(int i=0;i<w.length();i++)
        {
            if(r.contains(String.valueOf(w.charAt(i))))
               r1++;
        }
               return r1;
    }
    public String[] findWords(String[] words) {
        List<String> ar=new ArrayList<>();
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";String test="";
        int k=0;int result=0;
        for(int i=0;i<words.length;i++)
        {
            test=words[i].toLowerCase();
            if(s1.contains(String.valueOf(test.charAt(0))))
           { 
                result=row1(test,s1);
            }
            else if(s2.contains(String.valueOf(test.charAt(0))))
               { result=row1(test,s2);}
             else
               { result=row1(test,s3);}
            if(result==words[i].length())
            { ar.add(words[i]);
            }
        }
        String[]ns=new String[ar.size()];
        for(int i=0;i<ar.size();i++)
        {
            ns[i]=ar.get(i);
        }
         
        return ns;
    }
}