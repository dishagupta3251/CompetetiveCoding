class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        vector<int>ans;
          map<int ,int> mp;
        int c;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
         for(auto i:mp){
            if(i.second==1){
            c= i.first;
            ans.push_back(c);}
            else continue;
           
        }
        return ans;
    }   
    
};