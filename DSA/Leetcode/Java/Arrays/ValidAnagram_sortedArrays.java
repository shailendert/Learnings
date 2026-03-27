// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// Using Arrays
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Integer, Character> anagramMap = new HashMap();
        for (int index = 0; index < s.length(); index++)
        {
            anagramMap.put(index, s.charAt(index));
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray); Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray, tCharArray);
    }
}
