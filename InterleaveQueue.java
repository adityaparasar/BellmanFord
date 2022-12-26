import java.util.*;
public class NonRepeatingLetter {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> firsthalf= new LinkedList<>();
        int size= q.size()/2;
        for(int i=0;i<size;i++){
            firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
            
        }
    }

    public static void main(String args[]){
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
