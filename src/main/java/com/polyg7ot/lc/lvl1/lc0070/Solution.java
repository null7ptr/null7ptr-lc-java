/**
 * https://leetcode.com/problems/climbing-stairs/
 */
package com.polyg7ot.lc.lvl1.lc0070;

public class Solution {
    public int climbStairs(int n) {
        if(n == 0) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}