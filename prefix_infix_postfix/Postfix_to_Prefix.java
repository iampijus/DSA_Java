package prefix_infix_postfix;

import java.util.Stack;

public class Postfix_to_Prefix {
    public static void main(String[] args){
        String s = "AB+EF-*G/";
        String ans=post_to_pre(s);
        System.out.println("The prefix expresion is: " + ans);
    }

    public static boolean isOperand(char ch){
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }

    public static String post_to_pre(String s){
        int i=0;
        Stack<String> st=new Stack<>();
        while(i<s.length()){
            if(isOperand(s.charAt(i))){
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String op1=st.pop(); // pop() -> method will return the popped value;
                String op2=st.pop();
                String con=s.charAt(i)+op2+op1;
                st.push(con);
            }
           i++;
        }
        return st.peek();
    }
}
