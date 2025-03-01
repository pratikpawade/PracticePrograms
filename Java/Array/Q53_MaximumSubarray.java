class Solution {
    public int maxSubArray(int[] nums) {
        int max_res = nums[0];
        int cur = 0;
        for(int a : nums) {
            cur += a;
            max_res = Math.max(max_res , cur);

            if(cur < 0)
                cur = 0;
        }
        return max_res;
    }
}