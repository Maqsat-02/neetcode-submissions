class Solution {
     public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int num : nums) {
            hashtable.put(num, hashtable.getOrDefault(num, 0) + 1);
        }
        long countGTE = hashtable.values().stream().filter(val -> val > 1).count();
        return countGTE >= 1;
    }
}