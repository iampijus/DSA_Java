package monotonic_stack;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args){
        int [] arr={4,8,5,2,25};
        int [] ans=next_smaller_element(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] next_smaller_element(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}
