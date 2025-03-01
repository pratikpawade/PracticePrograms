public class Q1749_MaximumAbsoluteSumofAnySubarray {

    // Solution - Prefix sum
    public int maxAbsoluteSum(int[] nums) {
        int min_point = 0;
        int max_point = 0;
        int prefix_sum = 0;

        for(int ele : nums) {
            prefix_sum += ele;

            min_point = Math.min(min_point, prefix_sum);
            max_point = Math.max(max_point, prefix_sum);
        }
        return max_point - min_point;
    }
}

// Solution - Kadane's algorithm
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max_res = nums[0];
//         int cur = 0;
//         for(int a : nums) {
//             cur += a;
//             max_res = Math.max(max_res , cur);

//             if(cur < 0)
//                 cur = 0;
//         }
//         return max_res;
//     }
//     public int maxAbsoluteSum(int[] nums) {

//         int max_sum_subarray = maxSubArray(nums);


//         for(int i = 0; i < nums.length; i++) {
//             nums[i] = (-1) * nums[i];
//         }
//             int min_sum_subarray = maxSubArray(nums);

//         return Math.max(max_sum_subarray, min_sum_subarray);
//     }
// }