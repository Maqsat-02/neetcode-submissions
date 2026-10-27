class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> frequencyGroupMap = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);

            frequencyGroupMap.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(str);
        }
        return frequencyGroupMap.values().stream()
                .toList();
    }
}
