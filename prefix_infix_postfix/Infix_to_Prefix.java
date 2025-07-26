package prefix_infix_postfix;

import java.util.Stack;

public class Infix_to_Prefix {

    public static void main(String[] args){
        String s="(A+B*C)^(D-E)";
        String ans=in_to_pre(s);
        System.out.println("The prefix expresion is: " + ans);
    }

    public static String reverse(String s){
        char [] arr=s.toCharArray();
        int left=0, right=arr.length-1;
        while(left<right){
            char tempLeft=transform(arr[left]);
            char tempRight=transform(arr[right]);
            arr[left]=tempRight;
            arr[right]=tempLeft;
            left++;
            right--;
        }
        if (left == right) {
            arr[left] = transform(arr[left]);
        }
        String result=new String(arr);
        return result;
    }

    public static char transform(char ch){
        if(ch=='(') return ')';
        if(ch==')') return '(';
        return ch;
    }

    public static int priority(char ch) {
        if (ch == '^') return 3;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return -1;
    }

    public static String in_to_pre(String s){
        s=reverse(s);
        int i=0;
        Stack<Character> stack=new Stack<>();
        String ans="";
        while(i<s.length()){
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                    (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                ans+=s.charAt(i);
            }
            else if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    ans+=stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else if(s.charAt(i)=='^'){
                while(!stack.isEmpty() && priority(s.charAt(i))<=priority(stack.peek())){
                    ans+=stack.peek();
                    stack.pop();
                }
                stack.push(s.charAt(i));
            }
            else{
                while(!stack.isEmpty() && priority(s.charAt(i))<priority(stack.peek())){
                    ans+=stack.peek();
                    stack.pop();
                }
                stack.push(s.charAt(i));
            }
            i++;
        }

        while(!stack.isEmpty()) {
            ans += stack.peek();
            stack.pop();
        }
        ans=reverse(ans);
        return ans;
    }
}
