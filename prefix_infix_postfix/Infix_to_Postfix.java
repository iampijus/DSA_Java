package prefix_infix_postfix;

import java.util.Stack;

public class Infix_to_Postfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";
        String ans=in_to_post(s);
        System.out.println("The postfix expresion is: " + ans);
    }

    public static String in_to_post(String s) {
        int i = 0;
        Stack<Character> st = new Stack<>();
        String ans = "";
        while (i < s.length()) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                    (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                ans += s.charAt(i);
            } else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.peek();
                    st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && priority(s.charAt(i)) <= priority(st.peek())) {
                    ans += st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }

        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }

    public static int priority(char ch) {
        if (ch == '^') return 3;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return -1;
    }
}
