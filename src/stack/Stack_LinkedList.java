package stack;

class Stack{

    class StackNode{

        int data;

        StackNode next;

        StackNode(int d){

            this.data=d;

            this.next=null;

        }

    }

    StackNode top;

    int size;

    Stack(){

        this.top=null;

        this.size=0;

    }

    public void stackPush(int x){

        StackNode element=new StackNode(x);

        element.next=top;

        top=element;

        System.out.println("Element pushed.");

        size++;

    }

    public int stackPop(){

        if(top==null) return -1;

        int topData=top.data;

        top=top.next;

        size--;

        return topData;

    }

    public int stackSize(){

        return size;

    }

    public boolean stackIsEmpty(){

        if(top==null) return true;

        return false;

    }

    public void printStack(){

        StackNode temp=top;

        while(temp!=null){

            System.out.print(temp.data+" ");

            temp=temp.next;

        }

        System.out.println();

    }

}


class Stack_LinkedList{

    public static void main(String[] args){

        Stack s = new Stack();

        s.stackPush(10);

        s.stackPush(20);

        s.stackPush(40);

        s.stackPush(70);

        s.printStack();

        System.out.println("Element popped " + s.stackPop());

        System.out.println("Stack size: " + s.stackSize());

        System.out.println("Stack is empty: " + s.stackIsEmpty());

    }

}
