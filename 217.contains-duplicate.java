/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int value : nums){
            if (values.contains(value)){
                return true;
            } else {
                values.add(value);
            }
        }
        return false;
    }
}
// @lc code=end

