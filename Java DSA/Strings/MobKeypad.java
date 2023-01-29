package Strings;

public class MobKeypad {
    public static void main(String args[]) {
        String s = "GEEKSFORGEEKS";
        System.out.println(getMobKeypadSeq(s));
    }

    public static String getMobKeypadSeq(String s) {
        String temp[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
                "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            ans += temp[(int) s.charAt(i) - 65];
        }
        return ans;
    }
}
