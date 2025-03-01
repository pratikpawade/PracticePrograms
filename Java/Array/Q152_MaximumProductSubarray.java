public class Q152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int temp_max = Math.max(Math.max(current, max_so_far * current), min_so_far * current);
            min_so_far = Math.min(Math.min(current, max_so_far * current), min_so_far * current);

            max_so_far = temp_max;
            result = Math.max(result, max_so_far);
        }
        return result;
    }
}
