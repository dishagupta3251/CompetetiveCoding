class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String s1="",s2="",s3="";
        for(int i=0;i<firstWord.length();i++)
        {
            s1=s1+(firstWord.charAt(i)-'a');
        }
        for(int i=0;i<secondWord.length();i++)
        {
            
            s2=s2+(secondWord.charAt(i)-'a');
        }
        for(int i=0;i<targetWord.length();i++)
        {
            
            s3=s3+(targetWord.charAt(i)-'a');
        }
       
        if(Integer.parseInt(String.valueOf(s1))+Integer.parseInt(String.valueOf(s2))==Integer.parseInt(String.valueOf(s3)))
          return true;
        else
            return false;
    }
}