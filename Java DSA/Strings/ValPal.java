package Strings;

public class ValPal {
    public static void main(String args[]) {
        String q = "0P";
        System.out.print(isPalindrome(q));
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90
                    || (int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122
                    || (int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57) {
                ans += Character.toLowerCase(str.charAt(i));
            }
        }
        // System.out.println(ans);
        int i = 0, j = ans.length() - 1;
        while (i < j) {
            if (ans.charAt(i) != ans.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
