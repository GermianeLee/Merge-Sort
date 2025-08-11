import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
