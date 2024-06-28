//Given an integer array nums sorted in non-decreasing order, remove the 
//duplicates in-place such that each unique element appears only once. 

import java.util.Scanner;
public class removeduplicates_sorted_array {

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
         int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int len = removeDuplicates(arr);
        System.out.println("The length of the array after removing duplicates is: "+len);
        System.out.println("The array after removing duplicates is: ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
