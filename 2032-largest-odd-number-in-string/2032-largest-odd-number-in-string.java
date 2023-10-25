class Solution {
    public String largestOddNumber(String num) {
        String res="";
        for(int i=num.length()-1;i>=0;i--)
        {
            String temp=num.charAt(i)+"";
            int n=Integer.parseInt(temp);
           if(n%2!=0)
           {
               res=res+num.substring(0,i+1);
               break;
           }

        }
        return res;
    }
}