public class JavaTransposeMatrix {
    public static void trans(int arr[][]){
        int trans[][]= new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                trans[j][i]= arr[i][j];
            }
        }
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[][]= {{7,7,8},{8,8,7}};
        
        trans(arr);
    }
}
