
public class FirstoccuranceRecursion{
    public static int firstoccurance(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr, i+1, key);

    }


    public static void main(String args[]){
        int arr[]={6,8,5,2,1,5};
        int key= 5;
        System.out.println(firstoccurance(arr, 0, key));
    }
}
