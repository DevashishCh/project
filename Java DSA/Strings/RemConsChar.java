package Strings;

public class RemConsChar {
    public static void main(String args[]) {
        String a = "aaaaaaaddddddddmmmmjunudsuyvvhjsdfuy";
        System.out.println(removeConsecutiveCharacter(a));
    }

    public static String removeConsecutiveCharacter(String S) {
        String ans = "";
        ans += S.charAt(0);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != ans.charAt(ans.length() - 1)) {
                ans += S.charAt(i);
            }
        }
        return ans;
    }

}
