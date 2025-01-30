package DLL;

class Node {
    int data;
    Node next;
    Node back;

    public Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}


public class LearnDLL {
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node convertArray2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        prev.next = null;
        head.back = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }

    public static Node removeKthEle(Node head, int k) {
        if (head == null) {
            return null;
        }
        int cnt = 0;
        Node kNode = head;
        while (kNode != null) {
            cnt++;
            if (cnt == k) break;
            kNode = kNode.next;
        }
        Node prev = kNode.back;
        Node front = kNode.next;
        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;
        kNode.next = null;
        kNode.back = null;

        return head;
    }

    public static void deleteNode(Node temp){
        Node prev=temp.back;
        Node front=temp.next;
        // it will never be the head. head can not be deleted.
        if(front==null){
            prev.next=null;
            temp.back=null;
            return;
        }
        prev.next=front;
        front.back=prev;
        temp.back=temp.next=null;
    }

    public static Node insertBeforeHead(Node head,int val){

        Node newNode=new Node(val,head,null);
        head.back=newNode;
        return newNode;
    }

    public static Node insertBeforeTail(Node head,int val){
        if(head==null){
            return new Node(val,null,null);
        }
        if(head.next==null){
            return insertBeforeHead(head,val);
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev=tail.back;
        Node newNode=new Node(val,tail,prev);
        prev.next=newNode;
        tail.back=newNode;
        return head;
    }

    public static Node insertBeforeKthElement(Node head,int val,int k){
        if(k==1){
            return insertBeforeHead(head,val);
        }
        Node temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt==k) break;
            temp=temp.next;
        }
        Node prev=temp.back;
        Node newNode=new Node(val,temp,prev);
        prev.next=newNode;
        temp.back=newNode;
        return head;
    }

    public static void insertBeforeNode(Node node,int val){
        Node prev=node.back;
        Node newNode=new Node(val,node,prev);
        prev.next=newNode;
        node.back=newNode;
    }

    public static Node reverseDLL(Node head){
        Node current=head, last=null;
        while(current!=null){
            last=current.back;
            current.back=current.next;
            current.next=last;
            current=current.back;
        }

        return last.back;
    }

    public static void main(String[] args) {
        int[] arr = {12, 7, 3, 5};
        Node head = convertArray2DLL(arr);
//        head = removeKthEle(head,2);
//        deleteNode(head.next);
//        head=insertBeforeKthElement(head,100,4);
//        insertBeforeNode(head.next.next,100);
        head=reverseDLL(head);
        print(head);
    }
}
