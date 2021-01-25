/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            int value = nums[i];
            int difference  = target - value;
            if (numbers.containsKey(difference)){
                return new int[]{numbers.get(difference), i};
            }
            numbers.put(value, i);
        }
        throw new IllegalArgumentException();
    }
}
// @lc code=end

