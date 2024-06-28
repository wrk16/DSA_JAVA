import java.util.Arrays;
import java.util.Scanner;
public class binsrc {
    public static int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length - 1;
        while(l<=r){
            int mid = l + (r - l) / 2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        // Display the sorted array
        System.out.println("The sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the target element: ");
        int target = in.nextInt();
        //if target not found, then print element not found in the array
//Arrays.binarySearch() is an inbuilt function in Java that returns the index of the element in the array if it is found. If the element is not found, it returns the position where the element can be inserted.
        if(Arrays.binarySearch(nums, target) < 0){
            System.out.println("Element not found in the array");
        }
        else{
        int index = searchInsert(nums, target);
        System.out.println("The index where the target element is found : " + index);
    }
        in.close();
    }
}

