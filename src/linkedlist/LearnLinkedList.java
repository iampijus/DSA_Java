package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LearnLinkedList {
    public static Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }

    public static int lengthOfLL(Node head) {
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    public static boolean searchElement(Node head, int ele) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == ele) return true;
            temp = temp.next;
        }
        return false;
    }

    public static Node removeHead(Node head) {
        if (head == null) return null;
        head = head.next;
        return head;
    }

    public static Node removeTail(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node removeK(Node head, int k) {
        if (head == null) return head;
        if (k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }


        return head;
    }

    public static Node removeEl(Node head, int el) {
        if (head == null) return head;
        if (head.data == el) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }


        return head;
    }


    public static Node insertHead(Node head, int val) {
        return new Node(val, head);
    }

    public static Node insertTail(Node head, int val) {
        if (head == null) {
            Node newNode = new Node(val);
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    public static Node insertBeforeValue(Node head, int el, int val) {
        if (head == null) {
            return null;
        }

        if (head.data == el) {
            return new Node(val, head);
        }


        Node temp = head;
        while (temp.next != null) {

            if (temp.next.data == el) {
                Node x = new Node(val, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertPosition(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            } else {
                return head;
            }
        }
        if (k == 1) {
            return new Node(val, head);
        }

        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == (k - 1)) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7};

        Node head = convertToLL(arr);
        head = insertBeforeValue(head, 7, 100);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
//        System.out.println("Length of LL is: "+lengthOfLL(head));
//        System.out.println("Is present: "+searchElement(head,33));

    }
}
