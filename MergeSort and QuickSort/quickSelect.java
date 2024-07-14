import java.util.*;

public class quickSelect {
    static int ans = 0;
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    
    }


    static void quickselect(List<Integer> arr, int low, int high, int k) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            if(pIndex == k-1){
                ans = arr.get(pIndex);
                return;
            }
            if(k-1 < pIndex)  quickselect(arr, low, pIndex - 1, k);
            else   quickselect(arr, pIndex + 1, high, k);
        }
    }
    public static int findKthLargest(List<Integer> arr, int k) {
        quickselect(arr, 0, arr.size() - 1, k);
        return ans;

    }
    public static void main(String args[]) {
        List<Integer> arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
        int k = 3;
        System.out.println("Before Using quickSelect: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println("The 3rd largest element is: " + findKthLargest(arr, k));
    } 
}
