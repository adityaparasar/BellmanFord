#include <stdio.h>
int binarySearch(int a[],int n, int data){
    int l,r,mid;
    l = 0; r = n-1;

    while(l <= r){
        mid = (l+r)/2;
        if(a[mid] == data){
            return mid;
        }else if(a[mid] > data){
            r = mid - 1;
            
        }else{
            l = mid + 1;
        }
        
    }
    return -1;
}

int main(){
    int a[] = {2,3,4,5,6,7,8,9};
    int n = sizeof(a)/sizeof(int);
    int data;
    printf("Elements of array are: ");
    for(int i = 0; i < n; i++){
        printf("\t%d", a[i]);
    }
    printf("\nEnter the element that you want to search for: ");
    scanf("%d", &data);
    int result = binarySearch(a,n,data);
    if(result == -1){
        printf("Element not found");
    }else{
        printf("Element found at %d index", result);
    }
    return 0;

}
