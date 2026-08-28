class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int ones = 0;
        int minLen = Integer.MAX_VALUE;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {
            
            if (s.charAt(right) == '1') {
                ones++;
            }

            // Shrink the window while it has exactly k ones
            while (ones == k) {
                int len = right - left + 1;
                String current = s.substring(left, right + 1);

                if (len < minLen) {
                    minLen = len;
                    ans = current;
                } 
                else if (len == minLen && current.compareTo(ans) < 0) {
                    ans = current;
                }

                // Remove left character and try a smaller window
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }
        }

        return ans;
    }
}