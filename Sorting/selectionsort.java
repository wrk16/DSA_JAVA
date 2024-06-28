////Sort a given Array in increasing order using selection sort, but in each pass, put the kth maximum element at the right position.

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {10, 99, 86, 56, -1, 88};
        int n = arr.length;
        int k = 2; // Specify the value of k
        System.out.println("The array before sorting is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The array after sorting is:");
        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxdx = j;
                }
            }
            // Swap arr[i] and arr[maxdx]
            int temp = arr[maxdx];
            arr[maxdx] = arr[i];
            arr[i] = temp;
            // Put the kth maximum element at the right position
            int kthMax = findKthMax(arr, k, i);
            if (kthMax != -1) {
                int temp2 = arr[i];
                arr[i] = arr[kthMax];
                arr[kthMax] = temp2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to find the kth maximum element in the array
    public static int findKthMax(int[] arr, int k, int start) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = start; i < arr.length; i++) {
            if (arr[i] == max && k > 0) {
                k--;
                if (k == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}