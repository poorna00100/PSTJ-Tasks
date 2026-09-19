class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
Input: 
nums = [2,5,1,3,4,7], n = 3
Output: 
[2,3,5,4,1,7] 
