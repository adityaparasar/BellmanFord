public class TilingProblem {
    public static int tiling(int n){
        if(n==1||n==2){
            return n;
        }
        return tiling(n-1)+tiling(n-2);
       }
    
       public static void main(String args[]){
        System.out.println("Number ways= "+tiling(4));
       }
}
