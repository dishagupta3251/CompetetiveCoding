import java.util.*;
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        List<Integer> num =new ArrayList<>();
        for(int i:nums)
            num.add(i);
        while(!num.isEmpty())
        {
            for(int i=0;i<num.size();i++)
            { 
                if(!temp.contains(num.get(i)))
                {
                temp.add(num.get(i));
                num.remove(num.get(i));
                --i;}
             }
            res.add(new ArrayList<>(temp));
            System.out.println(res);
            temp.clear();
            
        }
        return res;
    }
}