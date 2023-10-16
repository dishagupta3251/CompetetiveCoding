class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        Set<List<Integer>> res=new HashSet<>();
        
        int ele=0;
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                ele=-(nums[i]+nums[j]);
                if(set.contains(ele))
                { List<Integer> ar=new ArrayList<>();
                    ar.add(nums[i]);
                    ar.add(nums[j]);
                    ar.add(ele);
                    // System.out.println(ar);
                    Collections.sort(ar);
                    res.add(ar);
                     // System.out.println(res);
                }
               
                set.add(nums[j]);
            }
            
        }
        List<List<Integer>> ans=new ArrayList<>(res);
        return ans;
        }
    }
