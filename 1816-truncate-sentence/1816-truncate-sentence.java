import java.util.StringTokenizer;
class Solution {
    public String truncateSentence(String s, int k) {
        StringTokenizer st=new StringTokenizer(s);
        String res="";
        while(st.hasMoreTokens()&&k>0)
        {
             k--;
            if(k==0)
                res=res+st.nextToken();
            else
            res=res+st.nextToken()+" ";
           
        }
        return res;
    }
}