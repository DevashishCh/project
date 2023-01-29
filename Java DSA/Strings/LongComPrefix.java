package Strings;

public class LongComPrefix {
    public static void main(String args[]) {
        String str[] = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] str) {
        String ans = str[0];
        for (int i = 1; i < str.length; i++) {
            ans = compare(ans, str[i]);
        }
        return ans;
    }

    public static String compare(String a, String b) {
        int i = 0;
        String c = "";
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) {
            c += a.charAt(i);
            i++;
        }
        return c;
    }
}
