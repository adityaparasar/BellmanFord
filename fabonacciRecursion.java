
public class fabonacciRecursion{
    public static int sum(int n){
        if(n==0 || n==1){
            return n;
        }
        int s=sum(n-1)+sum(n-2);
        return s;

    }

    public static void main(String args[]){
        System.out.println(sum(5));
    }
}
