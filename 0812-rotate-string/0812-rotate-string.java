class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
       for(int i=0;i<s.length();i++)
       {
           String temp=sb.charAt(0)+"";
           sb.deleteCharAt(0);
           sb.append(temp);
           System.out.println(sb);
           if(sb.toString().equals(goal))
           return true;
       }
       return false;
    }
}