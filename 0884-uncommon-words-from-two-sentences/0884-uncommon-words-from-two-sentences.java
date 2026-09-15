class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        // Count words from s1
        String[] words1 = s1.split("\\s+");

        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Count words from s2
        String[] words2 = s2.split("\\s+");

        for (String word : words2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Find words appearing exactly once
        ArrayList<String> list = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}