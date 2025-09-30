package com.jacandre.questions._0003_longest_substring;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 */

@Slf4j
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        var longestSubstring = 0;
        // Loop until end of string or until end of string is too short to beat the current longest.
        for (int i = 0; i < s.length() - longestSubstring; i++) {
            Set<Character> store = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                // Sets only allow unique elements, when a repeat character fails to be added, break the loop.
                if (!store.add(c)) {
                    break;
                }
                longestSubstring = Math.max(longestSubstring, store.size());
            }
        }
        return longestSubstring;
    }
}
