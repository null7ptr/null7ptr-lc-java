/**
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 * 
 * Time Complexity: O(logn)
 * 
 * Space Complexity: O(1)
 */
package main.java.lcidiot.lc0172;

class Solution {
    public int trailingZeroes(int n) {
        int zeroCount = 0;
        long currentMultiple = 5;
        
        while(n > 0){
            n /= currentMultiple;
            zeroCount += n;
        }
        
        return zeroCount;
    }
}