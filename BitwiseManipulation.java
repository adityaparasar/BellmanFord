import java.util.*;

public class BitwiseManipulation{
    //Get i th Bit
    public static int Getithbit(int n, int i ){
        int Bitmask=1<<i;
        if((n&Bitmask)==0){
            return 0;
        }
        return 1;
    }
    
    //Set i th bit
    public static int Setithbit(int n, int i){
        int Bitmask=1<<i;
        return n|Bitmask;
    }

    //Clear i th bit
    public static int Clearithbit(int n, int i){
        int Bitmask= ~(1<<i);
        return n&Bitmask; 
    }

    //Update ith bit
    public static int Updateithbit(int n, int i, int bit){
        n=Clearithbit(n, i);
        int Bitmask= bit<<i;
        return n|Bitmask;
    }

    //clear i bits
    public static int Clearibits(int n, int i){
        int Bitmaask= (~0)<<i;
        return n&Bitmaask;
    }

    //Clear range of bits
    public static int Clearranngeofbits(int n, int i,int j){
        int a= (~0)<<j+1;
        int b= (1<<i)-1;
        int Bitmask=a|b;
        return n&Bitmask;
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i= sc.nextInt();
        System.out.println(Setithbit(n, i));
    }
}
