class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<Character>();
        String res="";
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(!st.isEmpty())
            {if(st.peek()==s.charAt(i))
                st.pop();
            else
             st.push(s.charAt(i));
            }
            else
            st.push(s.charAt(i));
        }
        for(int i=0;i<st.size();i++)
        {
            res=res+st.get(i);
        }
        return res;
    }
}