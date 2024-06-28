public class passing_arr_toMethod {

    public static void modifyByValue(int[] arr) {
      // Modify elements inside the array
      arr[0] = 100;
    }

    public static void modifyByReference(int[] arr) {
      // Change the reference to point to a new array
      arr = new int[3];  // This won't affect the original array
    }
  
    public static void main(String[] args) {
      int[] numbers = {1, 2, 3};
  
      // Pass by value (reference copy)
      modifyByValue(numbers);
      System.out.println(numbers[0]); // Output: 100 (original array is modified)
  
      // Pass by value (reference doesn't change original array)
      modifyByReference(numbers);
      System.out.println(numbers[0]); // Output: 100 (original array remains unchanged)
    }
  }
  