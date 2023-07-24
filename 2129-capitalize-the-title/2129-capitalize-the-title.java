class Solution {
    public String capitalizeTitle(String title) {
        String[] str=title.split(" ");
        String res="";
        for(int i=0;i<str.length-1;i++)
        {
            if(str[i].length()==1||str[i].length()==2)
                res=res+str[i].toLowerCase()+" ";
            else
       { res=res+Character.toUpperCase(str[i].charAt(0))+(str[i].substring(1,str[i].length())).toLowerCase()+" ";}
        }
        if(str[str.length-1].length()==1||str[str.length-1].length()==2)
            return res+str[str.length-1].toLowerCase();
        return res+Character.toUpperCase(str[str.length-1].charAt(0))+(str[str.length-1].substring(1,str[str.length-1].length())).toLowerCase();
    }
}