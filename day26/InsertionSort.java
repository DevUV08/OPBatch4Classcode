import java.util.Arrays;
public class InsertionSort {
    static void sortData(int arr[]){
        int n=arr.length;
        for( int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,5,3};
        System.out.println("Array before sorting : "+Arrays.toString(arr));
        sortData(arr);
        System.out.println("Array after sorting : "+Arrays.toString(arr));
    }

}
