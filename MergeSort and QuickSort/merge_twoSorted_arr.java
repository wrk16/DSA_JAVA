
public class merge_twoSorted_arr {
    public static void main(String[] args) {
        
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        merge_twoSorted_arr obj = new merge_twoSorted_arr();
        obj.merge(nums1, m, nums2, n);
        
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr3 = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr3[k] = nums1[i]; // Copy from nums1
                i++;
                k++;
            } else {
                arr3[k] = nums2[j]; // Copy from nums2
                j++;
                k++;
            }
        }
        while (i < m) {
            arr3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr3[k] = nums2[j];
            j++;
            k++;
        }
        
        // Copy merged array back to nums1
        for (int p = 0; p < m + n; p++) {
            nums1[p] = arr3[p];
        }

//overall time complexity is O(m + n).

    }
    
}