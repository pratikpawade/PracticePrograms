public class Q167_TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int result;
        while(l < r) {
            result = numbers[l] + numbers[r];

            if(result > target) {
                r = r - 1;
            }
            else if(result < target) {
                l = l + 1;
            }
            else {
                int[] num = new int[]{l+1, r+1};
                return num;
            }
        }
        return null;
    }
}
