//https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        Map<Integer,Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(m.containsKey(target-nums[i])){
                ans[0] = m.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }else{
                m.put(nums[i],i);
            }
        }
        return ans;
        
    }
}