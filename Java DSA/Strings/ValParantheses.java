package Strings;

import java.util.Stack;

public class ValParantheses {
    public static void main(String args[]) {
        String s = "(){}[]{";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (st.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                return false;
            }
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (s.charAt(i) == '(') {
                    char a = st.pop();
                    if (a != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == '{') {
                    char a = st.pop();
                    if (a != '{') {
                        return false;
                    }
                } else if (s.charAt(i) == '[') {
                    char a = st.pop();
                    if (a != ']') {
                        return false;
                    }
                }
            }
            i++;
        }
        return true;
    }

}
