class Solution {
    public String largestGoodInteger(String num) {
        int result = -1;

        for (int i = 0; i + 2 < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch == num.charAt(i + 1) && ch == num.charAt(i + 2)) {
                result = Math.max(result, ch - '0');
            }
        }

        if (result == -1) {
            return "";
        }

        char digitChar = (char) ('0' + result);
        return String.valueOf(digitChar).repeat(3); // Java 11+
    }
}
