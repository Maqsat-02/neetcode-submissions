class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n != m) return false;

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        short[] freq = new short[26];

        for (int i = 0; i < n; i++) {
            freq[chars1[i] - 'a']++;
            freq[chars2[i] - 'a']--;
        }

        for (byte i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
