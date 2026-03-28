// Problem: Given an array of strings strs, group the anagrams together. You can return the answer in any order.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> group = new HashMap();
        for (String s : strs)
        {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!group.containsKey(key))
            {
                group.put(key, new ArrayList());
            }
            group.get(key).add(s);
        }
        return new ArrayList(group.values());
    }
}

// Analysis result: Used HashTable/Sorting/Array, Grouping anagrams by using sorted strings as canonical keys in a hash map.
// Suggested improvement: optimize further by using character frequency counts instead of sorting to build the key
