import java.util.*;

class Solution {
    public String longestNiceSubstring(String s) {

        int n = s.length();
        String ans = "";

        for (int size = 1; size <= n; size++) {

            int[] lower = new int[26];
            int[] upper = new int[26];

            int left = 0;

            for (int right = 0; right < n; right++) {

                char ch = s.charAt(right);

                if (Character.isLowerCase(ch)) {
                    lower[ch - 'a']++;
                } else {
                    upper[ch - 'A']++;
                }

                if (right - left + 1 > size) {

                    char remove = s.charAt(left);

                    if (Character.isLowerCase(remove)) {
                        lower[remove - 'a']--;
                    } else {
                        upper[remove - 'A']--;
                    }

                    left++;
                }

                if (right - left + 1 == size) {

                    boolean nice = true;

                    for (int i = 0; i < 26; i++) {

                        if ((lower[i] > 0 && upper[i] == 0) ||
                            (upper[i] > 0 && lower[i] == 0)) {

                            nice = false;
                            break;
                        }
                    }

                    if (nice && size > ans.length()) {
                        ans = s.substring(left, right + 1);
                    }
                }
            }
        }

        return ans;
    }
}