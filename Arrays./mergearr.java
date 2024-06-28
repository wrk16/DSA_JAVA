import java.util.Scanner;   
public class mergearr {
    public static <arr1> void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr1[]={1,2,3,4,5};
        int arr2[]={10,20,30,40,50};
        int size1=arr1.length;
        int size2=arr2.length;
        int arr3[]=new int[size1+size2];
        int i=0,j=0,k=0;
        while(i<size1 && j<size2){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<size1){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<size2){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[l]+" ");
        }
        in.close();
    }
}








//leetcode merge two sorted arrays
//The overall time complexity is O(m + n).
/*class Solution {
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
    }
}
*/
