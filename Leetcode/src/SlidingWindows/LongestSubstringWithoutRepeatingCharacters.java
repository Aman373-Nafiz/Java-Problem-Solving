package SlidingWindows;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        HashSet<Character> ch = new HashSet<>();
        int count = 0;
        int len = s.length();
        for ( ;i < len; ) {
            if (!ch.contains(s.charAt(i))) {
                ch.add(s.charAt(i));
                i++;
                count = Math.max(count, ch.size());
            } else {

                ch.remove(s.charAt(j));
                j++;
            }
        }
        return count;
    }
}
