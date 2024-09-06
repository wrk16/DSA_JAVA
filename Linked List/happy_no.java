package LINKLIST;
// Question : Write a code to determine if a number n is "happy", use the concept of Linked List for it.

/* Example 1:
Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1

Example 2:
Input: n = 2
Output: false

Algorithm:
    1. maintain slow and fast pointers at n
    2. iterate a while loop until slow==fast, in which for slow pointer find the square of the number and for fast pointer find the square of the square of the number 
    3. if slow==1 then return true
    4. return false
    5. Time complexity : O(n)
    6. Space complexity : O(1)
 */

public class happy_no {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(true){
            slow = findSquare(slow);   // find the square of the number
            fast = findSquare(findSquare(fast));  // find the square of the square of the number
            if(slow==fast) break;
        }
        return slow==1;
    }

    public int findSquare(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 52;
        happy_no obj = new happy_no();
        boolean isHappy = obj.isHappy(n);
        System.out.println(isHappy);
    }
}
