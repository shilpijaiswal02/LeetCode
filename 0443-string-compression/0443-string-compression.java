class Solution {
    public int compress(char[] chars) {

        int write = 0;

        for (int i = 0; i < chars.length; ) {

            int count = 1;
            int j = i + 1;

            while (j < chars.length && chars[i] == chars[j]) {
                count++;
                j++;
            }

            chars[write++] = chars[i];

            if (count > 1) {
                String s = String.valueOf(count);

                for (int k = 0; k < s.length(); k++) {
                    chars[write++] = s.charAt(k);
                }
            }

            i = j; // skip processed characters
        }

        return write;
    }
}