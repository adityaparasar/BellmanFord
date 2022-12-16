import java.util.ArrayList;

public class WaterBucket {
    public static int bucket(ArrayList<Integer> height){
        int max= Integer.MIN_VALUE;
        int i=0;
        int j=height.size()-1;
        while(i!=j){
            int width=j-i;
            int ht= Math.min(height.get(i),height.get(j));
            int area=width*ht;
            max= Math.max(max,area);
            if(height.get(i)<height.get(j)){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(bucket(height));

    }
}
