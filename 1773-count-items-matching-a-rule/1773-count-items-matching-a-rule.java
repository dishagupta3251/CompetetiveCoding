class Solution {
    int cal(List<List<String>> products,int place,String value)
    {int c=0;
        for(int i=0;i<products.size();i++)
            {   
                if(products.get(i).get(place).equals(value))
                    c++;
            }
     return c;
        
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
           if(ruleKey.equals("type"))
            {
               count=cal(items,0,ruleValue);
            //     for(int i=0;i<items.size();i++)
            // {   
            //     if(items.get(i).get(0).equals(ruleValue))
            //         c++;
            // }
        }
        if(ruleKey.equals("color"))
            {count=cal(items,1,ruleValue);
            //     for(int i=0;i<items.size();i++)
            // {   
            //     if(items.get(i).get(1).equals(ruleValue))
            //         c++;
            // }
        }
        if(ruleKey.equals("name"))
            {count=cal(items,2,ruleValue);
            //     for(int i=0;i<items.size();i++)
            // {   
            //     if(items.get(i).get(2).equals(ruleValue))
            //         c++;
            // }
        }
        
        return count;
    }
}