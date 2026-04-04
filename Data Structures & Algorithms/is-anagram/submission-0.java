class Solution {
    public boolean isAnagram(String s, String t) {
       // 1. 長度不同直接判處死刑
        if (s.length() != t.length()) return false;

        Map<Character, Integer> dic1 = new HashMap<>();
        Map<Character, Integer> dic2 = new HashMap<>();

        // 2. Java 的 for-each 寫法
        for (char c : s.toCharArray()) {
            // 使用 getOrDefault 可以把 if-else 簡化成一行
            dic1.put(c, dic1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            dic2.put(c, dic2.getOrDefault(c, 0) + 1);
        }

        // 3. Map 的內容比較要用 .equals()
        return dic1.equals(dic2);
    }
}
