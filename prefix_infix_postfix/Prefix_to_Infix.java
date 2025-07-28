package prefix_infix_postfix;

import java.util.Stack;

public class Prefix_to_Infix {

    public static void main(String[] args){
        String s = "*-A/BC-/AKL";
        String ans=pre_to_in(s);
        System.out.println("The infix expresion is: " + ans);
    }

    public static boolean isOperand(char ch){
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }

    public static String pre_to_in(String s){
        int i=s.length()-1;
        Stack<String> st=new Stack<>();
        while(i>=0){
            if(isOperand(s.charAt(i))){
                st.push(String.valueOf(s.charAt(i)));  // String.valueOf() -> used to convert data into string representation
            }
            else{
                String t1=st.peek();
                st.pop();
                String t2=st.peek();
                st.pop();
                String con="("+t1+s.charAt(i)+t2+")";
                st.push(con);
            }
            i--;
        }
        return st.peek();
    }
}
