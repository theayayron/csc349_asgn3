import java.util.Arrays;

public class Inversions {

    /**
     * Input: arr[], an array of unique positive integers.
     * Output: inv, the number of inversions in arr
     * Counts the number of inversions by performing a modified merge sort on the given data. Inversions are counted
     * as the data is being merged back together.
     */
    public static int invCounter(int[] arr) {
        int inv = 0;

        if (arr.length > 2) {

            // DIVIDE STEP
            int mid = arr.length/2;
            int[] A = Arrays.copyOfRange(arr, 0, mid);
            int[] B = Arrays.copyOfRange(arr, mid, arr.length);
            inv += invCounter(A);
            inv += invCounter(B);

            // CONQUER and COMBINE STEP
            // Note: We both count inversions and combine/sort the two arrays A and B during invMerge. The original
            //       input array is modified directly so that recursive calls upstream receive the sorted array.
            inv += invMerge(A, B, arr);

        } else  if (arr.length == 2){
            if(arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
                inv++;
            }
        }

        return inv;
    }

    /**
     * Merges the two given arrays into ascending order and counts the number of inversions.
     * Returns the an array containing the number of inversions and the newly merged array.
     */
    private static int invMerge(int[] A, int[] B, int[] dest) {
        int inv = 0;
        int i = 0, j = 0, k = 0;

        // compare and fill until one array is completely empty
        while(i < A.length && j < B.length) {

            if(A[i] < B[j]) {
                dest[k] = A[i];
                i++;

            } else {
                dest[k] = B[j];
                j++;
                inv += A.length - i;
            }

            k++;
        }

        // fill remaining spaces
        if(i==A.length) {
            for(; j < B.length; j++, k++)
                dest[k] = B[j];
        } else {
            for(; i < A.length; i++, k++)
                dest[k] = A[i];
        }

        return inv;
    }
}
