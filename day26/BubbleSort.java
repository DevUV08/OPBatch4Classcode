import java.util.*;
class BubbleSort{
    static void sortData(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println("Array before sorting : "+Arrays.toString(arr));
        sortData(arr);
        System.out.println("Array after sorting : "+Arrays.toString(arr));

    }
}