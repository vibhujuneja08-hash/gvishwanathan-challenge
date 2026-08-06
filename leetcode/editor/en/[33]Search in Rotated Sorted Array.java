//There is an integer numsay nums sorted in ascending order (with distinct 
//values). 
//
// Prior to being passed to your function, nums is possibly left rotated at an 
//unknown index k (1 <= k < nums.length) such that the resulting numsay is [nums[k],
// nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
//example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0
//,1,2]. 
//
// Given the numsay nums after the possible rotation and an integer target, 
//return the index of target if it is in nums, or -1 if it is not in nums. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
// 
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
// 
// Example 3: 
// Input: nums = [1], target = 0
//Output: -1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5000 
// -10⁴ <= nums[i] <= 10⁴ 
// All values of nums are unique. 
// nums is an ascending numsay that is possibly rotated. 
// -10⁴ <= target <= 10⁴ 
// 
//
// Related Topics numsay Binary Search 👍 30607 👎 1840


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int high= nums.length-1;
        int low=0;

        while(low<=high){
            int mid=low +(high -low)/2;
            if ( nums [ mid ]== target ){
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low]<=target && target < nums[mid]){
                    high = mid -1;

                }
                else{
                    low= mid +1;
                }

            }
            else {
                if (nums[mid] < target && target <= nums [high]) {
                    low = mid +1;

                }
                else {
                    high = mid -1;
                }
            }

        }
        return -1;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
