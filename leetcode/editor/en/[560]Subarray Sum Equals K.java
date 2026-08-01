//Given an array of integers nums and an integer k, return the total number of 
//subarrays whose sum equals to k. 
//
// A subarray is a contiguous non-empty sequence of elements within an array. 
//
// 
// Example 1: 
// Input: nums = [1,1,1], k = 2
//Output: 2
// 
// Example 2: 
// Input: nums = [1,2,3], k = 3
//Output: 2
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 2 * 10⁴ 
// -1000 <= nums[i] <= 1000 
// -10⁷ <= k <= 10⁷ 
// 
//
// Related Topics Array Hash Table Prefix Sum 👍 25523 👎 862


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currentSum = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
