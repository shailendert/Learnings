class Solution {
    public int lengthOfLongestSubstring(String s) {
        int stringSize = s.length();
        HashSet<Character> lookupSet = new HashSet();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < stringSize; right++)
        {
            while(lookupSet.contains(s.charAt(right)))
            {
                lookupSet.remove(s.charAt(left));
                left++;
            }
            lookupSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

// 
