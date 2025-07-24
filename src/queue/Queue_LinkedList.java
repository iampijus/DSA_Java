package queue;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Queue_LinkedList{
    Node start,end;
    int size=0;
    public int push(int x){
        Node temp=new Node(x);
        if(start==null){
            start=temp;
            end=temp;
        }else{
            end.next=temp;
            end=temp;
        }
        size+=1;
        return x;
    }

    public int pop(){
        if(start==null){
            System.out.println("Queue is Empty.");
        }
        int x=start.data;
        start=start.next;
        size-=1;
        return x;
    }

    public int top(){
        if(start==null){
            System.out.println("Queue is Empty.");
        }
        return start.data;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args){
        Queue_LinkedList q=new Queue_LinkedList();
        System.out.println("Element pushed to queue is:"+ q.push(10));
        System.out.println("Element pushed to queue is:"+ q.push(20));
        System.out.println("Element pushed to queue is:"+ q.push(30));
        System.out.println("Element pushed to queue is:"+ q.push(40));
        System.out.println("The size of the queue is:"+ q.size());
        System.out.println("The top is:"+ q.top());
        System.out.println("The element poped is:"+q.pop());
        System.out.println("The element poped is:"+q.pop());
        System.out.println("The top is:"+ q.top());
        System.out.println("The size of the queue is:"+ q.size());
    }
}