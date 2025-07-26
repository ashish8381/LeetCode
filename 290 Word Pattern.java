class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] word = s.split(" ");

        if (pattern.length() != word.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String w = word[i];

            if (map.containsKey(c)) {

                if (!map.get(c).equals(w)) {
                    return false;
                }
            } else {
                map.put(c, w);
            }

            if (map2.containsKey(w)) {

                if (map2.get(w) != c) {
                    return false;
                }
            } else {
                map2.put(w, c);
            }

        }

        return true;
    }
}