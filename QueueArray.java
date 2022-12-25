import java.util.*;
public class Parantheses{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr= new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        
    
        //isEmpty
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        //add
        public static void add(int data){  
            if(rear==size-1){ 
                System.out.println("Queue is full.");
                
                return;
            }
            rear+=1;
            arr[rear]=data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int front= arr[0];
            for(int i=0;i<rear;i++){
                arr[i]= arr[i+1];
            }
            rear-=1;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[0];
        }
        //is queue full
        public static boolean isFull(){
            return (rear+1)%size== front;
        }
        //Circular add
        public static void ciradd(int data){
            if(isFull()){
                System.out.println("queue is full.");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear= (rear+1)%size;
            arr[rear]= data;
        }
        //Circular remove
        public static int cirremove(){
            if(isEmpty()){
                System.out.println("queue is empty.");
                return -1;
            }
            int result= arr[front];
            
            if(front==rear){
                front=rear=-1;
            }else{
                front= (front+1)%size;
            }
            return result; 
        }
        //circular peek
        public static int cirpeek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[front];
        }
        
    }
    public static void main(String args[]){
        
        Queue q= new Queue(5);
        q.ciradd(1);
        q.ciradd(2);
        q.ciradd(3);

        while(!q.isEmpty()){
            System.out.println(q.cirpeek());
            q.cirremove();
        }
    }
}