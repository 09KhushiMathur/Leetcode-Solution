class Solution {

    public void reves(char[] s, int left, int right) {

        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reves(s, left + 1, right - 1);

    }

    public void reverseString(char[] s) {
        reves(s, 0, s.length-1);

    }
}