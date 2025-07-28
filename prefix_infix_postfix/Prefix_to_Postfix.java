package prefix_infix_postfix;

import java.util.Stack;

public class Prefix_to_Postfix {
    public static void main(String[] args){
        String s = "/-AB*+DEF";
        String ans=pre_to_post(s);
        System.out.println("The postfix expresion is: " + ans);
    }

    public static boolean isOperand(char ch){
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }

    public static String pre_to_post(String s){
        int i=s.length()-1;
        Stack<String> st=new Stack<>();
        while(i>=0){
            if(isOperand(s.charAt(i))){
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String op1=st.pop(); // pop() -> method will return the popped value;
                String op2=st.pop();
                String con=op1+op2+s.charAt(i);
                st.push(con);
            }
            i--;
        }
        return st.peek();
    }
}
