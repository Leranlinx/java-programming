public class Selection_Sort {
    public static void SelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    
    // Test Method 
    // public static void TestSort ()        
    public static void main(String[] args) {
        int[] data = {8, 3, 1, 7, 2};
        SelectionSort(data);
        // System.out.println("Sorted array:");
        for (int element : data) {
            System.out.print(element + " ");
        }
    }
    
}
