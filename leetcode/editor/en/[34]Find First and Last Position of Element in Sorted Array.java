//Given an array of integers nums sorted in non-decreasing order, find the 
//starting and ending position of a given target value. 
//
// If target is not found in the array, return [-1, -1]. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
// 
// Example 2: 
// Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
// 
// Example 3: 
// Input: nums = [], target = 0
//Output: [-1,-1]
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums is a non-decreasing array. 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics Array Binary Search 👍 23575 👎 656


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low =0;
        int high= nums.length -1;
        int First= nums.length;
        while (low<=high){
            int mid = low +(high -low)/2;
            if (nums [mid]>=target){
                First=mid;
                high =mid-1;

            }
            else {
                low=mid+1;
            }
        }
        low =0;
        high= nums.length -1;
        int Last= nums.length;
        while (low<=high){
            int mid = low +(high -low)/2;
            if (nums [mid]>target){
                Last=mid;
                high =mid-1;

            }
            else {
                low=mid+1;
            }
        }
        Last=Last-1;
        if (First == nums.length || nums[First] != target){
            return   new int[]{-1,-1};
        }

        return new int[]{First,Last};
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
