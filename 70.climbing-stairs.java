import jdk.javadoc.internal.tool.resources.javadoc;

/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        // int[] memo = new int[n];
        // return countStepsMemo(0, n, memo);
        return countSteps(n);
    }
    public int countStepsMemo(int currentStep, int destinationStep, int[] memo){
        if (currentStep > destinationStep){
            return 0;
        } else if (currentStep == destinationStep) {
            return 1;
        } else if (memo[currentStep] == 0) {
            memo[currentStep] = countStepsMemo(currentStep + 1, destinationStep, memo) + countStepsMemo(currentStep + 2, destinationStep, memo);
        }
        return memo[currentStep];
    }
    public int countSteps(int destinationStep){
        if (destinationStep == 1){
            return 1;
        }
        int[] table = new int[destinationStep + 1];
        table[0] = 0;
        table[1] = 1;
        table[2] = 2;
        for (int i = 3; i <= destinationStep; ++i) {
            table[i] = table[i -1] + table[i -2];
        }
        return table[destinationStep];
    }
}
// @lc code=end

