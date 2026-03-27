// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Using HashMap
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> charCountMap = new HashMap();
        
        for (char sChar : s.toCharArray())
            charCountMap.put(sChar, charCountMap.getOrDefault(sChar, 0) + 1);

        for (char tChar : t.toCharArray())
            charCountMap.put(tChar, charCountMap.getOrDefault(tChar, 0) - 1);

        for (var pair : charCountMap.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
