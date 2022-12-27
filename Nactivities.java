import java.lang.reflect.Array;
import java.util.*;
public class ReverseQueue {
    public static void main(String args[]){
       int start[] = {1,3,0,5,8,5};
       int end[]   = {2,4,6,7,9,9};
       int maxact=0;
       ArrayList<Integer> ans= new ArrayList<>();
       maxact=1;
       ans.add(0);
       int lastend= end[0];
       for(int i=1;i<start.length;i++){
        if(start[i]>=lastend){
            ans.add(i);
            lastend= end[i];
            maxact++;
        }
       }
       System.out.println("Max activity done is "+maxact);
       for(int i=0;i<ans.size();i++){
        System.out.print("A"+ans.get(i)+" ");
       }
      
    }
}
