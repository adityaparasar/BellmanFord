import java.util.*;
public class WeakestSoldier {
    static class Row implements Comparable<Row>{
        int soldier;
        int idx;
        public Row(int soldier, int idx){
            this.soldier=soldier;
            this.idx= idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldier==r2.soldier){
                return this.idx-r2.idx;
            }else{
                return this.soldier-r2.soldier;
            }
        }
    }
    
    public static void main (String args[]){
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0; i<army.length; i++){
            int soldier=0;
            for(int j=0; j<army[0].length; j++){
                if(army[i][j]==1){
                    soldier+=1;
                }
            }
            pq.add(new Row(soldier, i));
        }

        for(int i=0; i<k;i++){
            System.out.print("Row"+pq.remove().idx+" ");
        }
    }
}
