//Given an integer array of size n, find all elements that appear more than ⌊n /
// 3⌋ times. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,2,3]
//Output: [3]
// 
//
// Example 2: 
//
// 
//Input: nums = [1]
//Output: [1]
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2]
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5 * 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// 
// Follow up: Could you solve the problem in linear time and in O(1) space? 
//
// Related Topics Array Hash Table Sorting Counting 👍 11156 👎 507


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=nums[i];
                count1=1;
            }
            else if(count2==0){
                candidate2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
        }
        if(count1>nums.length/3){
            list.add(candidate1);
        }
        if(count2>nums.length/3){
            list.add(candidate2);
        }
        return list;
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)
