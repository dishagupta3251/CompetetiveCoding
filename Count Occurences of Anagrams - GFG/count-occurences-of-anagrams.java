//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<pat.length();i++)
        {
            if(map.containsKey(pat.charAt(i)))
            map.put(pat.charAt(i),map.get(pat.charAt(i))+1);
            else
            map.put(pat.charAt(i),1);
        }
        int count=map.size();int j=0;int i=0;
        while(j<txt.length())
        {
            if(map.containsKey(txt.charAt(j)))
            {
                map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
                if(map.get(txt.charAt(j))==0)
                count--;
            }
            if(j<i+pat.length()-1)
            j++;
            else if(j==i+pat.length()-1)
            {
                if(count==0)
                 ans++;
                 if(map.containsKey(txt.charAt(i)))
                 {map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                     if(map.get(txt.charAt(i))==1)
                         count++;
                 }
                 i++;
                 j++;
            }
        }
        return ans;
    }
}