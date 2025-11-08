import java.util.Arrays;
public class SelectionSort {
    static void sortData(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int smallIdx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallIdx]){
                    smallIdx=j;
                }
            }
            int temp=arr[smallIdx];
            arr[smallIdx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,5,3};
        System.out.println("Array before sorting : "+Arrays.toString(arr));
        sortData(arr);
        System.out.println("Array after sorting : "+Arrays.toString(arr));
    }
}
