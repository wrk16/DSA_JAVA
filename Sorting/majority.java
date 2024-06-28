class majority {
    public int majorityElement(int[] nums) {
        // Initialize variables
        int count = 0;
        int candidate = 0;

        // Iterate through the array
        for (int num : nums) {
            // If the count is zero, set the current number as the candidate
            if (count == 0) {
                candidate = num;
            }
            // If the current number matches the candidate, increment the count
            if (num == candidate) {
                count++;
            } else {
                // If the current number does not match the candidate, decrement the count
                count--;
            }
        }
        // Return the candidate as the majority element
        return candidate;
    }
    public static void main(String[] args) {
        majority obj = new majority();
        int[] nums = {4,1,4,9,9,2,2,6,6,9,9,9};
        System.out.println("The majority element is: " + obj.majorityElement(nums));
    }
}