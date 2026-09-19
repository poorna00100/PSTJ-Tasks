class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
Input: 
nums = [0,2,1,5,3,4]
Output: 
[0,1,2,4,5,3]
