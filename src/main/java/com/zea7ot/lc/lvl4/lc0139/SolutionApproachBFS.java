/**
 * https://leetcode.com/problems/word-break/
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
package com.zea7ot.lc.lvl4.lc0139;

import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class SolutionApproachBFS {
    public boolean wordBreak(String str, List<String> wordDict) {
        if(str == null || str.length() == 0) return false;
        
        Set<String> wordSet = new HashSet<String>(wordDict);
        Queue<String> queue = new LinkedList<String>();
        queue.offer(str);
        
        Set<String> visited = new HashSet<String>();
        
        while(!queue.isEmpty()){
            String cur = queue.poll();
            for(int i = 1; i <= cur.length(); i++){
                if(wordSet.contains(cur.substring(0, i))){
                    if(i == cur.length()) return true;
                    
                    String sub = cur.substring(i);
                    if(!visited.contains(sub)){
                        queue.offer(sub);
                        visited.add(sub);
                    }
                }
            }
        }
        
        return false;
    }
}