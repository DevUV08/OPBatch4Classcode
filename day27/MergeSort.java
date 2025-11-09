import java.util.Arrays;
public class MergeSort {
    static void divide(int arr[], int start, int end){
            if(start>=end){
                return;
            }
            int mid= start+(end-start)/2;
            divide(arr, start, mid); // left
            divide(arr, mid+1, end); // right
            merge(arr, start, mid, end);
    }
    static void merge(int arr[], int start, int mid, int end){
        int temp[]= new int[end-start+1];
        int i=start;
        int j= mid+1;
        int k=0;
        while (i<=mid&&j<=end) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while (i<=mid) {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while (j<=end) {
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int m=0;m<temp.length;m++){
            arr[start+m]=temp[m];
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,3,1};
        int start=0;
        int end= arr.length-1;
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        divide(arr, start, end);
        System.out.println("After sorting : "+ Arrays.toString(arr));


    }
}
