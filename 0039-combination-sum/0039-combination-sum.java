class Solution {
    void findCombo(int ind,int target,int b[],List<List<Integer>> ans, List<Integer> arr)
    {
        if(ind==b.length)
        {
            if(target==0)
                ans.add(new ArrayList<>(arr));
            return;
        }
        if(b[ind]<=target)
        {
            arr.add(b[ind]);
            findCombo(ind,target-b[ind],b,ans,arr);
            arr.remove(arr.size()-1);
        }
         findCombo(ind+1,target,b,ans,arr);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombo(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
}