import java.util.*;
public class MaxAreaInHistogram {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void add(int data){
            Node newnode= new Node(data);
            if(head==null){
                head= tail= newnode;
                
                return;
            }
            tail.next= newnode;
            tail=newnode;
            
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int result= head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            
            
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
           
            return head.data;
        }
    }

    public static void main(String args[]){
        Queue q= new Queue();
        
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
