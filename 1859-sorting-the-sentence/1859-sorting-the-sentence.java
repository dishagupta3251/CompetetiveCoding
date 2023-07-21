class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String temp="";String res="";int len=str.length;
        for(int j=0;j<len;j++)
        {for(int i=0;i<len;i++)
        {
            int pos=(str[i].charAt(str[i].length()-1))-'0';
            temp=str[pos-1];
            str[pos-1]=str[i];
            str[i]=temp;
        }}
        for(int i=0;i<str.length-1;i++)
        {
            res=res+str[i].substring(0,str[i].length()-1)+" ";
        }
        return res+str[len-1].substring(0,str[len-1].length()-1);
    }
}