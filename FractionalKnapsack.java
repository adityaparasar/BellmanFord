import java.util.Arrays;
import java.util.Comparator;

public class WaterBucket {
    public static void main(String args[]){
        int value[]=  {60,100,120};
        int weight[]= {10,20,30};
        int cap= 50;
        
        double ratio[][]= new double[value.length][2];
        
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]= value[i]/(double)weight[i];
        }
        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        for(int i=0;i<ratio.length;i++){
            for(int j=0;j<=1;j++){
                System.out.print(ratio[i][j]+" ");
            }
            System.out.println();
        }
        
        int finVal=0;
        for(int i=value.length-1; i>=0; i--){
            int idx= (int)ratio[i][0];
            if(cap>=weight[idx]){
                finVal+=value[idx];
                cap-=weight[idx];
            }else{
                finVal+=ratio[i][1]*cap;
                cap=0;
                break;
            }
        }
        System.out.println("Total value is "+finVal);
    }
}
