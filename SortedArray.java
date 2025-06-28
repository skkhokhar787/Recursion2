public class SortedArray {
    public static boolean isSorted (int [] arr, int idx) {
        // Base case: if we reach the end of the array
        if (idx == arr.length - 1) {
            return true; // The array is sorted
        }

        // Check if the current element is less than or equal to the next element
        if (arr[idx] < arr[idx + 1]) {
            // Recursively check the rest of the array
            return isSorted(arr, idx + 1);
        } else {
            return false; // The array is not sorted
        }
    }
    public static void main (String [] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isSorted = isSorted(arr, 0);
        System.out.println("Is the array sorted? " + isSorted);
    }
}
