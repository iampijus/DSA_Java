package prefix_infix_postfix;

import java.util.Stack;

public class Postfix_to_Infix {
    public static void main(String[] args){
        String s = "AB+CD-*";
        String ans=post_to_in(s);
        System.out.println("The infix expresion is: " + ans);
    }

    public static boolean isOperand(char ch){
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }

    public static String post_to_in(String s){
        int i=0;
        Stack<String> st=new Stack<>();

        while(i<s.length()){
            if(isOperand(s.charAt(i))){
                st.push(s.charAt(i)+"");  // char to string
            }
            else {
                String t1=st.peek();
                st.pop();
                String t2=st.peek();
                st.pop();
                String con="("+t2+s.charAt(i)+t1+")"; // first give the last peek() got from the stack.
                st.push(con);
            }
            i++;
        }
        return st.peek();
    }
}
