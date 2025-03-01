class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[] a = new int[2];
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;

                }
            }
        }
        return a;
    }
}

// using HASHMAP

// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         Map<Integer, Integer> HM = new HashMap<>();
//         for(int i = 0; i < nums.length; i++) {
//             int com = target - nums[i];

//             if(HM.containsKey(com)) {
//                 return new int[]{i, HM.get(com)};
//             } else {
//                 HM.put(nums[i], i);
//             }
//         }
//         return null;

//     }
// }