class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        Map<Integer, Integer> arrayIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = target - numbers[i];
            if (arrayIndexMap.containsKey(diff)) {
                return new int[]{arrayIndexMap.get(diff), i};
            }
            arrayIndexMap.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}
