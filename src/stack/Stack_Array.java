package stack;

class Stack_Array{
    public static void main(String[] args){
        stack s=new stack();
        s.push(5);
        s.push(2);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());  //7
        System.out.println("Size of the stack before deleting any element " + s.size());  //3
        System.out.println("The element deleted is " + s.pop());  //7
        System.out.println("Size of the stack after deleting an element " + s.size());  //2
        System.out.println("Top of the stack after deleting an element " + s.top());  //2
    }
}

class stack{
    int top=-1;
    int [] st=new int[10];
    void push(int x){
        top++;
        st[top]=x;
    }
    int pop(){
        int x=st[top];
        top--;
        return x;
    }
    int top(){
        return st[top];
    }
    int size(){
        return top+1;
    }
}