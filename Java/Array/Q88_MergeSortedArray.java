class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1ptr = m-1;
        int nums2ptr = n-1;
        int resultptr = m+n-1;

        while(nums1ptr >= 0 && nums2ptr >= 0) {
            if(nums1[nums1ptr] >= nums2[nums2ptr]) {
                nums1[resultptr] = nums1[nums1ptr];
                nums1ptr--;
            } else {
                nums1[resultptr] = nums2[nums2ptr];
                nums2ptr--;
            }
            resultptr--;
        }

        while(nums2ptr >= 0) {
            nums1[resultptr] = nums2[nums2ptr];
            nums2ptr--;
            resultptr--;
        }
    }
}