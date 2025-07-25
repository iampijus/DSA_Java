package queue;

class Queue{

    int arr[];

    int start, end, currSize, maxSize;

    public Queue(){

        arr=new int[16];

        start=-1;

        end=-1;

        currSize=0;

    }

    public Queue(int maxSize){

        this.maxSize=maxSize;

        arr=new int[maxSize];

        start=-1;

        end=-1;

        currSize=0;

    }

    public void push(int newEle){

        if(currSize==maxSize){

            System.out.println("The Queue is Full...");

            System.exit(1);

        }

        if(currSize==0){

            start=0;

            end=0;

        }else{

            end=(end+1)%maxSize;

        }

        System.out.println("The element pushed is " + newEle);

        arr[end]=newEle;

        currSize++;

    }

    int pop(){

        if(currSize==0){

            System.out.println("The Queue is Empty...");

            System.exit(1);

        }

        int popped=arr[start];

        if(currSize==1){

            start=-1;

            end=-1;

        }else{

            start=(start+1)%maxSize;

        }

        currSize--;

        return popped;

    }

    int top(){

        if(currSize==0){

            System.out.println("The Queue is Empty...");

            System.exit(1);

        }

        return arr[start];

    }

    int size(){

        return currSize;

    }

}

class Queue_Array{

    public static void main(String[] args){

        Queue q = new Queue(6);

        q.push(4);

        q.push(14);

        q.push(24);

        q.push(34);

        System.out.println("The peek of the queue before deleting any element " + q.top());  //4

        System.out.println("The size of the queue before deletion " + q.size());  //4

        System.out.println("The first element to be deleted " + q.pop());  //4

        System.out.println("The peek of the queue after deleting an element " + q.top());  //14

        System.out.println("The size of the queue after deleting an element " + q.size()); //3

    }

}

