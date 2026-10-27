class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> arrElementCountMap = new HashMap<>();
        for (int num : nums) {
            arrElementCountMap.merge(num, 1, Integer::sum);
        }
        return arrElementCountMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
