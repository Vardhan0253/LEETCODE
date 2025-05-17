public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes
            String s1 = expandAroundCenter(s, i, i);
            // Even length palindromes
            String s2 = expandAroundCenter(s, i, i + 1);
            // Update longest palindrome
            if (s1.length() > longest.length()) {
                longest = s1;
            }
            if (s2.length() > longest.length()) {
                longest = s2;
            }
        }
        return longest;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindrome substring
        return s.substring(left + 1, right);
    }
}
