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
            
        }
        if(ruleKey.equals("color"))
            {count=cal(items,1,ruleValue);
           
        }
        if(ruleKey.equals("name"))
            {count=cal(items,2,ruleValue);
            
        }
        
        return count;
    }
}