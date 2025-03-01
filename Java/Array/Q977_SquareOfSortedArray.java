import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        int i = 0;
        for(int b : nums){
            a[i] = b*b ;
            i++;
        }
        Arrays.sort(a);
        return a;
    }
}