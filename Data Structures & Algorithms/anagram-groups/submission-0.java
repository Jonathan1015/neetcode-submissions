class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            String temp = new String(arr);

            if (!map.containsKey(temp)) {
                map.put(temp, new ArrayList<>());
            }

            map.get(temp).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
