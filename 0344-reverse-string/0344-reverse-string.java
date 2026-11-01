class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    static void reverse(char[] s, int left, int right) {

        // Base condition
        if (left >= right) {
            return;
        }

        // Swap characters
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // Recursive call
        reverse(s, left + 1, right - 1);
    }
}