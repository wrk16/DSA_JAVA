import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Find_K_closest_Elements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>(); // Initialize an empty list to store the result
        int n = arr.length; // Get the length of the input array
        
        // base case 1: if x is less than or equal to the first element of the array, return the first k elements
        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) { // Iterate through the first k elements of the array
                ans.add(arr[i]); // Add the current element to the result list
            }
            return ans; // Return the result list
        }
        
        // base case 2: if x is greater than or equal to the last element of the array, return the last k elements
        if (x >= arr[n-1]) {
            for (int i = n-1; i >= n-k; i--) { // Iterate through the last k elements of the array in reverse order
                ans.add(arr[i]); // Add the current element to the result list
            }
            Collections.sort(ans); // Sort the result list in ascending order
            return ans; // Return the result list
        }
        
        // find the lower bound of the element x in the array
        int left = 0;
        int right = n - 1;
        while (left <= right) { // Perform binary search to find the lower bound of x
            int mid = left + (right - left) / 2;
            if (arr[mid] >= x) {
                right = mid - 1; // Update the right pointer to search the left half of the array
            } else {
                left = mid + 1; // Update the left pointer to search the right half of the array
            }
        }
        
        // find the k closest elements to x
        int i = left - 1; // Initialize the left pointer to the element just before the lower bound
        int j = left; // Initialize the right pointer to the lower bound
        while (k > 0) { // Iterate until we have found k closest elements
            if (i < 0) { // If the left pointer is out of bounds, add the element at the right pointer
                ans.add(arr[j++]);
            } else if (j == n || Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) { // If the left element is closer or the right pointer is out of bounds, add the left element
                ans.add(arr[i]);  i--;
            } else { // Otherwise, add the right element
                ans.add(arr[j]);   j++;
            }
            k--; // Decrement the remaining number of elements to find
        }
        
        Collections.sort(ans); // Sort the result list in ascending order
        return ans; // Return the result list
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=4;
        int x=-1;
        System.out.println(findClosestElements(arr,k,x));
    }
}