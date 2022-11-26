public class JavaSorting {
    //Bubble sorting
    public static void Bubble(int arr[]){
        int swap=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }System.out.println("Swap="+swap);
    }
    
    //Selection  sort
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }int temp=arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
        }
    }

    //Insertion sort
    public static void Insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    //counting sort
    public static void counting(int arr[]){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maximum=Math.max(maximum,arr[i]);
        }
        int count[]= new int[maximum+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]= {5,4,1,3,2};
        selection(arr);
        print(arr);
    }
}
