package com.an7one.leetcode.lvl2.lc0973;

import com.an7one.util.Constant;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/
 * <p>
 * Time Complexity:     O(N * lgN)
 * Space Complexity:    O(1)
 */
@SuppressWarnings({Constant.WARNING.UNUSED})
public class SolutionApproach1SortingArray {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, (p1, p2) -> (p1[0] * p1[0] + p1[1] * p1[1]) - (p2[0] * p2[0] + p2[1] * p2[1]));
        return Arrays.copyOfRange(points, 0, K);
    }
}