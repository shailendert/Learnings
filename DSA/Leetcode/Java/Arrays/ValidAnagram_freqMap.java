// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Using Frequency map
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        
        for(int j = 0; j < t.length(); j++)
            freq[t.charAt(j) - 'a']--;
        
        for (int count : freq)
            if (count != 0) return false;
        return true;

    }
}
